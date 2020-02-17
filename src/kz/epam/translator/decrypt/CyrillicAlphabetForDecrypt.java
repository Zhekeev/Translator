package kz.epam.translator.decrypt;

import kz.epam.translator.choice.Choice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CyrillicAlphabetForDecrypt {
    private Choice choice = new Choice();

    private final char [] russian ={'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м',
            'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ',  'ь',
            'ы', 'э', 'ю', 'я','1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?'};

    private final String [] morse = {".-","-...",".--","--.","-..",".",".-.--","...-","--..","..",
            ".---","-.-",".-..","--","-.","---",".--.",".-.","...","-","..-",
            "..-.","....","-.-.","---.","----","--.-","-..-","-..-","-.--","..-..","..--",".-.-",".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----","--..--", ".-.-.-", "..--.."};

    public String decryptionFromMorzeToCyrillic(String sentence) {
        String str = "";
        String[] morsec = sentence.split(" ");
        for (int i = 0; i < morsec.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (morse[j].equals(morsec[i])) {
                    str = str + russian[j];
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
            String text = Files.readString(Paths.get("CyrillicTextInMorse.txt"));
            System.out.println(text);
            decryptionFromMorzeToCyrillic(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
