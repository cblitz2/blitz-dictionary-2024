package blitz.dictionary;

import com.opencsv.exceptions.CsvValidationException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EnglishDictionaryTest {

    @Test
    public void getDefinition() throws CsvValidationException, IOException {
        // given
        EnglishDictionary dictionary = new EnglishDictionary();
        String testWord = "Zealotist";

        // when
        List<String> definitions = dictionary.getDefinition(testWord);

        // then
        assertTrue(definitions.contains("A zealot."));
    }

}