package kz.epam.translator.choice;

import kz.epam.translator.encrypt.CyrillicAlphabetForEncryption;
import kz.epam.translator.encrypt.RomanAlphabetForEncryption;

import java.util.Scanner;

public class ChoiceForEncypt {

    private Scanner keyboard  = new Scanner(System.in);
    private RomanAlphabetForEncryption romanAlphabet = new RomanAlphabetForEncryption();
    private CyrillicAlphabetForEncryption cyrillicAlphabet = new CyrillicAlphabetForEncryption();
    private final static int romanChoiceNumber = 1;
    private final static int cyrrilicChoiceNumber = 2;

    public void encrypt() {
        System.out.print("На Латинице или Кириллице? ");
        System.out.print(" 1. Латиница");
        System.out.println(" 2. Кирилица");
        int choiceNumber = keyboard.nextInt();
        switch (choiceNumber){
            case romanChoiceNumber:
                String userInputTextRoman = textProcessing();
                romanAlphabet.encryptionToMorzeInRoman(userInputTextRoman);
                break;
            case cyrrilicChoiceNumber:
                String userInputTextCyrrilic = textProcessing();
                cyrillicAlphabet.encryptionToMorzeInCyrillic(userInputTextCyrrilic);
                break;
            default:
                System.out.println("Ошибочка, повторите выбор");
                ChoiceForEncypt choiceForEncypt = new ChoiceForEncypt();
                choiceForEncypt.encrypt();
        }
    }

    public String textProcessing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String userInput = scanner.nextLine().toLowerCase();
        return userInput;
    }
}

