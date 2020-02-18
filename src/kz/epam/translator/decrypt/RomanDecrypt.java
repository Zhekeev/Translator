package kz.epam.translator.decrypt;

import kz.epam.translator.alphabet.Alphabet;
import kz.epam.translator.choice.Choice;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RomanDecrypt {
    private Choice choice = new Choice();
    private Alphabet alphabet = new Alphabet();
    private final static String FILE_NAME="RomanTextInMorse.txt";

    private String decryptionFromMorseToRoman(String sentence) {
        String str = "";
        String[] morseSprlit = sentence.split(" ");
        for (int i = 0; i < morseSprlit.length; i++) {
            for (int j = 0; j < alphabet.MORSE_ROMAN_ALPH.length; j++) {
                if (alphabet.MORSE_ROMAN_ALPH[j].equals(morseSprlit[i])) {
                    str = str + alphabet.ROMAN_ALPH[j];
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
            decryptionFromMorseToRoman(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


