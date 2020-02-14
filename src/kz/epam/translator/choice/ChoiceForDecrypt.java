package kz.epam.translator.choice;

import kz.epam.translator.decrypt.CyrillicAlphabetForDecrypt;
import kz.epam.translator.decrypt.RomanAlphabetForDecrypt;

import java.util.Scanner;

public class ChoiceForDecrypt {
    private Scanner keyboard = new Scanner(System.in);
    private RomanAlphabetForDecrypt romanAlphabetForDecrypt = new RomanAlphabetForDecrypt();
    private CyrillicAlphabetForDecrypt cyrillicAlphabetForDecrypt = new CyrillicAlphabetForDecrypt();

    public void decrypt() {
        System.out.print("На Латинице или Кириллице? ");
        System.out.print(" 1. Латиница");
        System.out.println(" 2. Кирилица");
        int choiceNumber = keyboard.nextInt();
        switch (choiceNumber) {
            case 1:
                romanAlphabetForDecrypt.fileReadFromFolder();
                break;
            case 2:
                cyrillicAlphabetForDecrypt.fileReadFromFolder();
                break;
            default:
                ChoiceForDecrypt runner = new ChoiceForDecrypt();
                System.out.println("Ошибочка, повторите выбор");
                runner.decrypt();
        }
        keyboard.close();
    }
}

