package kz.epam.translator.choice;

import kz.epam.translator.encrypt.CyrillicEncryption;
import kz.epam.translator.encrypt.RomanEncryption;

import java.util.Scanner;

public class ChoiceForEncypt {

    private Scanner keyboard  = new Scanner(System.in);
    private RomanEncryption romanAlphabet = new RomanEncryption();
    private CyrillicEncryption cyrillicAlphabet = new CyrillicEncryption();
    private final static int ROMAN_NUMBER = 1;
    private final static int CYRILLIC_NUMBER = 2;

    public void encrypt() {
        System.out.print("На Латинице или Кириллице? ");
        System.out.print(" 1. Латиница");
        System.out.println(" 2. Кирилица");
        int choiceNumber = keyboard.nextInt();
        switch (choiceNumber){
            case ROMAN_NUMBER:
                String userInputTextRoman = textProcessing();
                romanAlphabet.encryptionToMorseInRoman(userInputTextRoman);
                break;
            case CYRILLIC_NUMBER:
                String userInputTextCyrrilic = textProcessing();
                cyrillicAlphabet.encryptionToMorseInCyrillic(userInputTextCyrrilic);
                break;
            default:
                throw new IllegalArgumentException("You were told to choose from two dumbass");
        }
    }

    public String textProcessing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String userInput = scanner.nextLine().toLowerCase();
        return userInput;
    }
}

