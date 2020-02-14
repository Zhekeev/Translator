package choice;

import encrypt.CyrillicAlphabetForEncryption;
import encrypt.RomanAlphabetForEncryption;

import java.util.Scanner;

public class ChoiceForEncypt {

    private Scanner keyboard  = new Scanner(System.in);
    private RomanAlphabetForEncryption romanAlphabet = new RomanAlphabetForEncryption();
    private CyrillicAlphabetForEncryption cyrillicAlphabet = new CyrillicAlphabetForEncryption();

    public void encrypt() {
        System.out.print("На Латинице или Кириллице? ");
        System.out.print(" 1. Латиница");
        System.out.println(" 2. Кирилица");
        int choiceNumber = keyboard.nextInt();
        String userInputText = textProcessing();
        switch (choiceNumber){
            case 1:
                romanAlphabet.encryptionToMorzeInRoman(userInputText);
                break;
            case 2:
                cyrillicAlphabet.encryptionToMorzeInCyrillic(userInputText);
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

