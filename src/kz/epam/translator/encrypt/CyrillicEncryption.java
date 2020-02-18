package kz.epam.translator.encrypt;

import kz.epam.translator.alphabet.Alphabet;
import kz.epam.translator.choice.Choice;
import java.io.IOException;
import java.io.FileWriter;

public class CyrillicEncryption {
    private Choice choice = new Choice();
    private final static String FILE_NAME = "CyrillicTextInMorse.txt";
    private Alphabet alphabet = new Alphabet();

    public void encryptionToMorseInCyrillic(String userInput){
        String str = "";
        char[] chars = userInput.toCharArray();
        for (int i = 0; i < chars.length; i++){
            for (int j = 0; j < alphabet.CYRILLIC_ALPH.length; j++){
                if (alphabet.CYRILLIC_ALPH[j] == chars[i]){
                    str = str + alphabet.MORSE_CYRILLIC_ALPH[j] + " ";
                }
            }
        }
        System.out.println(str);
        fileWritToFolder(str);
        choice.choice();
    }

    private void fileWritToFolder(String string){
        try(FileWriter fileWriter =new FileWriter(FILE_NAME)){
            fileWriter.write(string);
        }catch (IOException exeption){
            System.out.println(exeption.getMessage());
        }
    }
}

