package kz.epam.translator.encrypt;

import kz.epam.translator.alphabet.Alphabet;
import kz.epam.translator.choice.Choice;
import java.io.FileWriter;
import java.io.IOException;

public class RomanEncryption {
    private Choice choice = new Choice();
    private Alphabet alphabet = new Alphabet();
    private final static String FILE_NAME="RomanTextInMorse.txt";

    public void encryptionToMorseInRoman(String userInput){
        String str = "";
        char[] chars = userInput.toCharArray();
        for (int i = 0; i < chars.length; i++){
            for (int j = 0; j < alphabet.ROMAN_ALPH.length; j++){
                if (alphabet.ROMAN_ALPH[j] == chars[i]){
                    str = str + alphabet.MORSE_ROMAN_ALPH[j] + " ";
                }
            }
        }
        System.out.println(str);
        fileWritToFolder(str);
        choice.choice();
    }

    private void fileWritToFolder(String string){
        try(FileWriter fileWriter = new FileWriter(FILE_NAME)){
            fileWriter.write(string);
        }catch (IOException exeption){
            System.out.println(exeption.getMessage());
        }
    }
}


