package kz.epam.translator.choice;

import java.util.Scanner;

public class Choice {
    private Scanner keyboard = new Scanner(System.in);
    private int choiceNumber;
    private final static int encryptChoiceNumber = 1;
    private final static int decryptChoiceNumber = 2;
    public void choice(){
        System.out.print("Выберите функцию: ");
        System.out.print(" 1. Шифровать");
        System.out.println(" 2. Дешифровать ");
        choiceNumber = keyboard.nextInt();
        switch (choiceNumber){
            case encryptChoiceNumber:
                ChoiceForEncypt choiceForEncypt = new ChoiceForEncypt();
                choiceForEncypt.encrypt();
                break;
            case decryptChoiceNumber:
               ChoiceForDecrypt choiceForDecrypt = new ChoiceForDecrypt();
               choiceForDecrypt.decrypt();
               break;
            default:
                Choice runner = new Choice();
                System.out.println("Ошибочка, повторите выбор");
                runner.choice();
        }
        keyboard.close();
    }
}
