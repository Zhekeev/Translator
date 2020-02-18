package kz.epam.translator.choice;

import kz.epam.translator.decrypt.CyrillicDecrypt;
import kz.epam.translator.decrypt.RomanDecrypt;

import java.util.Scanner;

public class ChoiceForDecrypt {
    private Scanner keyboard = new Scanner(System.in);
    private RomanDecrypt romanAlphabetForDecrypt = new RomanDecrypt();
    private CyrillicDecrypt cyrillicAlphabetForDecrypt = new CyrillicDecrypt();
    private final static int ROMAN_NUMBER = 1;
    private final static int CYRILLIC_NUMBER = 2;

    public void decrypt() {
        System.out.print("На Латинице или Кириллице? ");
        System.out.print(" 1. Латиница");
        System.out.println(" 2. Кирилица");
        int choiceNumber = keyboard.nextInt();
        switch (choiceNumber) {
            case ROMAN_NUMBER:
                romanAlphabetForDecrypt.fileReadFromFolder();
                break;
            case CYRILLIC_NUMBER:
                cyrillicAlphabetForDecrypt.fileReadFromFolder();
                break;
            default:
                throw new IllegalArgumentException("You were told to choose from two dumbass");
        }
        keyboard.close();
    }
}

