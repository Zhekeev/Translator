package choice;

import java.util.Scanner;

public class Choice {
    private Scanner keyboard = new Scanner(System.in);
    public int choiceNumber;

    public void choice(){
        System.out.print("Выберите функцию: ");
        System.out.print(" 1. Шифровать");
        System.out.println(" 2. Дешифровать ");
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
            default:
                Choice runner = new Choice();
                System.out.println("Ошибочка, повторите выбор");
                runner.choice();
        }
        keyboard.close();
    }
}
