package blitz.dictionary;

import com.opencsv.exceptions.CsvValidationException;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.io.IOException;

public class DictionaryFrame extends JFrame {

    private JTextField word = new JTextField();
    private JTextArea definitionArea = new JTextArea();

    public DictionaryFrame() throws CsvValidationException, IOException {
        setSize(400, 300);
        setTitle("English Dictionary");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        definitionArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(definitionArea);

        setLayout(new BorderLayout());
        add(word, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        EnglishDictionary dictionary = new EnglishDictionary();

        word.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                update();
            }

            public void removeUpdate(DocumentEvent e) {
                update();
            }

            public void changedUpdate(DocumentEvent e) {
                update();
            }

            private void update() {
                SwingUtilities.invokeLater(() -> {
                    String inputWord = word.getText();
                    java.util.List<String> definitions = dictionary.getDefinition(inputWord);
                    definitionArea.setText("");
                    for (String definition : definitions) {
                        definitionArea.append(definition + "\n");
                    }
                });
            }
        });
    }
}
