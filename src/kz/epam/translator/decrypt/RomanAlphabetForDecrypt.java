package kz.epam.translator.decrypt;

import kz.epam.translator.choice.Choice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RomanAlphabetForDecrypt {
    private Choice choice = new Choice();

    private final char[] roman = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?' };

    private final String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", " -..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.." };

    private String decryptionFromMorzeToRoman(String sentence) {
        String str = "";
        String[] morsec = sentence.split(" ");
        for (int i = 0; i < morsec.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (morse[j].equals(morsec[i])) {
                    str = str + roman[j];
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
            String text = Files.readString(Paths.get("RomanTextInMorse.txt"));
            System.out.println(text);
            decryptionFromMorzeToRoman(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


