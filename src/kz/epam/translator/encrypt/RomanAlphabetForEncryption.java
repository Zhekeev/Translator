package kz.epam.translator.encrypt;

import kz.epam.translator.choice.Choice;

import java.io.FileWriter;
import java.io.IOException;

public class RomanAlphabetForEncryption {
    private Choice choice = new Choice();

    private char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?' };

    private String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", " -..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.." };

    public void encryptionToMorzeInRoman(String userInput){
        String str = "";
        char[] chars = userInput.toCharArray();
        for (int i = 0; i < chars.length; i++){
            for (int j = 0; j < english.length; j++){
                if (english[j] == chars[i]){
                    str = str + morse[j] + " ";
                }
            }
        }
        System.out.println(str);
        fileWritToFolder(str);
        choice.choice();
    }

    private void fileWritToFolder(String string){
        try(FileWriter fileWriter = new FileWriter("RomanTextInMorse.txt")){
            fileWriter.write(string);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}


