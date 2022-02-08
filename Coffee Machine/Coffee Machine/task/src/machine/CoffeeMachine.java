package machine;
import machine.factories.ActionsFactory;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var machine = new Machine();

        String actionMessage;

        do {
            machine.askAction();
            actionMessage = scanner.next();

            if(!actionMessage.equals("exit")){
                machine.ProcessInput(actionMessage);
            }
        } while (!actionMessage.equals("exit"));
    }
}
