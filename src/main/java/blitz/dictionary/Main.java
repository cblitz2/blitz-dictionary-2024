package blitz.dictionary;

import com.opencsv.exceptions.CsvValidationException;
import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new DictionaryFrame().setVisible(true);
            } catch (IOException | CsvValidationException e) {
                e.printStackTrace();
            }
        });
    }
}

