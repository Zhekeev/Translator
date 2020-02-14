package choice;

import encrypt.CyrillicAlphabetForEncryption;
import encrypt.RomanAlphabetForEncryption;

import java.util.Scanner;

public class ChoiceForEncypt {

    private Scanner keyboard  = new Scanner(System.in);
    private String userInput;
    private Scanner scannerForEncryptMethod = new Scanner(System.in);
    private RomanAlphabetForEncryption romanAlphabet = new RomanAlphabetForEncryption();
    private CyrillicAlphabetForEncryption cyrillicAlphabet = new CyrillicAlphabetForEncryption();

    public void encrypt() {
        System.out.print("На Латинице или Кириллице? ");
        System.out.print(" 1. Латиница");
        System.out.println(" 2. Кирилица");
        int choiceNumber = keyboard.nextInt();
        switch (choiceNumber){
            case 1:
                System.out.println("Введите слово");
                userInput=scannerForEncryptMethod.nextLine().toLowerCase();
                romanAlphabet.encryptionToMorzeInRoman(userInput);
                break;
            case 2:
                System.out.println("Введите слово");
                userInput = scannerForEncryptMethod.nextLine().toLowerCase();
                cyrillicAlphabet.encryptionToMorzeInCyrillic(userInput);
                break;
            default:
                System.out.println("Ошибочка, повторите выбор");
                ChoiceForEncypt choiceForEncypt = new ChoiceForEncypt();
                choiceForEncypt.encrypt();
        }
        keyboard.close();
    }
}
