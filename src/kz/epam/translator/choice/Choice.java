package kz.epam.translator.choice;

import java.util.Scanner;

public class Choice {
    private Scanner keyboard = new Scanner(System.in);
    private int choiceNumber;
    private final static int ENCRYPT_NUMBER = 1;
    private final static int DECRYPT_NUMBER = 2;

    public void choice(){
        System.out.print("Выберите функцию: ");
        System.out.print(" 1. Шифровать");
        System.out.println(" 2. Дешифровать ");
        choiceNumber = keyboard.nextInt();
        switch (choiceNumber){
            case ENCRYPT_NUMBER:
                ChoiceForEncypt choiceForEncypt = new ChoiceForEncypt();
                choiceForEncypt.encrypt();
                break;
            case DECRYPT_NUMBER:
               ChoiceForDecrypt choiceForDecrypt = new ChoiceForDecrypt();
               choiceForDecrypt.decrypt();
               break;
            default:
                throw new IllegalArgumentException("You were told to choose from two dumbass");
        }
        keyboard.close();
    }
}
