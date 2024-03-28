package blitz.dictionary;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Reads the englishDictionary file ONCE.
 */
public class EnglishDictionary {

    public ArrayList<String[]> words = new ArrayList<>();

    public EnglishDictionary() throws CsvValidationException, IOException {
        CSVReader in = null;
        in = new CSVReader(new FileReader("/Users/chanablitz/Documents/TOURO/Spring 2024/"
                + "Computer Methodology/blitz-dictionary-2024/src/main/resources/englishDictionary.csv"));
        String[] record = null;

        while ((record = in.readNext()) != null) {
            // record is ONE line of the CSV
            words.add(record);
        }
        in.close();
    }

    /**
     * @param word to look up.
     * @return a List of definitions, or an empty list if the word doesn't exist.
     */
    public List<String> getDefinition(String word) {
        List<String> definition = new ArrayList<>();
        for (String[] record : words) {
            if (record[0].equalsIgnoreCase(word)) {
                String[] splitDefinitions = record[2].split(";");
                definition.addAll(Arrays.asList(splitDefinitions));
            }
        }
        return definition;
    }
}