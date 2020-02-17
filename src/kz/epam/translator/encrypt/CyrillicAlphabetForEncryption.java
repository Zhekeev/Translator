package kz.epam.translator.encrypt;

import kz.epam.translator.choice.Choice;

import java.io.IOException;
import java.io.FileWriter;

public class CyrillicAlphabetForEncryption {
    private Choice choice = new Choice();

    private char [] cyrillic ={'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м',
            'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ',  'ь',
            'ы', 'э', 'ю', 'я','1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?'};

    private String [] morse = {".-","-...",".--","--.","-..",".",".-.--","...-","--..","..",
            ".---","-.-",".-..","--","-.","---",".--.",".-.","...","-","..-",
            "..-.","....","-.-.","---.","----","--.-","-..-","-..-","-.--","..-..","..--",".-.-",".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----","--..--", ".-.-.-", "..--.."};

    public void encryptionToMorzeInCyrillic(String userInput){
        String str = "";
        char[] chars = userInput.toCharArray();
        for (int i = 0; i < chars.length; i++){
            for (int j = 0; j < cyrillic.length; j++){

                if (cyrillic[j] == chars[i]){
                    str = str + morse[j] + " ";
                }
            }
        }
        System.out.println(str);
        fileWritToFolder(str);
        choice.choice();
    }

    private void fileWritToFolder(String string){
        try(FileWriter fileWriter =new FileWriter("CyrillicTextInMorse.txt")){
            fileWriter.write(string);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

