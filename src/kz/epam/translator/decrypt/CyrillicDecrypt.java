package kz.epam.translator.decrypt;

import kz.epam.translator.alphabet.Alphabet;
import kz.epam.translator.choice.Choice;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CyrillicDecrypt {
    private Choice choice = new Choice();
    private Alphabet alphabet = new Alphabet();
    private final static String FILE_NAME = "CyrillicTextInMorse.txt";

    public String decryptionFromMorseToCyrillic(String sentence) {
        String str = "";
        String[] morseSplit = sentence.split(" ");
        for (int i = 0; i < morseSplit.length; i++) {
            for (int j = 0; j < alphabet.MORSE_CYRILLIC_ALPH.length; j++) {
                if (alphabet.MORSE_CYRILLIC_ALPH[j].equals(morseSplit[i])) {
                    str = str + alphabet.CYRILLIC_ALPH[j];
                }
            }
        }
        System.out.println("Ваше слово ");
        System.out.println(str);
        choice.choice();
        return str;
    }

    public void fileReadFromFolder(){
        try {
            String text = Files.readString(Paths.get(FILE_NAME));
            System.out.println(text);
            decryptionFromMorseToCyrillic(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
