package kz.epam.translator.choice;

import java.util.Scanner;

public class Choice {
    private Scanner keyboard = new Scanner(System.in);
    public int choiceNumber;

    public void choice(){
        System.out.print("Выберите функцию: ");
        System.out.print(" 1. Шифровать");
        System.out.print(" 2. Дешифровать ");
        System.out.println("3. Закрыть");
        choiceNumber = keyboard.nextInt();
        switch (choiceNumber){
            case 1:
                ChoiceForEncypt choiceForEncypt = new ChoiceForEncypt();
                choiceForEncypt.encrypt();
                break;
            case 2:
               ChoiceForDecrypt choiceForDecrypt = new ChoiceForDecrypt();
               choiceForDecrypt.decrypt();
               break;
            case 3:
                System.exit(0);
            default:
                Choice runner = new Choice();
                System.out.println("Ошибочка, повторите выбор");
                runner.choice();
        }
        keyboard.close();
    }
}
