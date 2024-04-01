package blitz.dictionary;

import com.opencsv.exceptions.CsvValidationException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnglishDictionaryTest {

    @Test
    public void getDefinition() throws CsvValidationException, IOException {
        // given
        EnglishDictionary dictionary = new EnglishDictionary();
        String testWord = "boot";

        // when
        List<String> definitions = dictionary.getDefinition(testWord);

        // then
        assertEquals(definitions.toString(), "[Remedy,  relief,  amends,  reparation,  hence, one "
                + "who brings relief., That which is given to make an exchange equal, "
                + "or to make up for the deficiency of value in one of the things exchanged.,"
                + " Profit,  gain,  advantage,  use., To profit,  to advantage,  to avail, "
                + " -- generally followed by it,  as, what boots it?, To enrich,  to benefit, "
                + " to give in addition., A covering for the foot and lower part of the leg, "
                + "ordinarily made of leather., An instrument of torture for the leg, "
                + "formerly used to extort confessions, particularly in Scotland., A place at the "
                + "side of a coach, where attendants rode,  also, "
                + "a low outside place before and behind the body of the coach., "
                + "A place for baggage at either end of an old-fashioned stagecoach., "
                + "An apron or cover (of leather or rubber cloth) for the driving seat of a vehicle,"
                + " to protect from rain and mud., The metal casing and flange fitted about a pipe"
                + " where it passes through a roof., To put boots on, esp. for riding., To "
                + "punish by kicking with a booted foot., To boot one's self,  "
                + "to put on one's boots., Booty,  spoil.]");
    }

}