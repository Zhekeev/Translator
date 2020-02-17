package kz.epam.translator.choice;

import kz.epam.translator.decrypt.CyrillicAlphabetForDecrypt;
import kz.epam.translator.decrypt.RomanAlphabetForDecrypt;

import java.util.Scanner;

public class ChoiceForDecrypt {
    private Scanner keyboard = new Scanner(System.in);
    private RomanAlphabetForDecrypt romanAlphabetForDecrypt = new RomanAlphabetForDecrypt();
    private CyrillicAlphabetForDecrypt cyrillicAlphabetForDecrypt = new CyrillicAlphabetForDecrypt();
    private final static int romanChoiceNumber = 1;
    private final static int cyrrilicChoiceNumber = 2;

    public void decrypt() {
        System.out.print("На Латинице или Кириллице? ");
        System.out.print(" 1. Латиница");
        System.out.println(" 2. Кирилица");
        int choiceNumber = keyboard.nextInt();

        switch (choiceNumber) {
            case romanChoiceNumber:
                romanAlphabetForDecrypt.fileReadFromFolder();
                break;
            case cyrrilicChoiceNumber:
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

