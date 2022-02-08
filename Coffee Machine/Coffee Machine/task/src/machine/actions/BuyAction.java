package machine.actions;

import machine.Machine;
import machine.factories.CoffeeFactory;

import java.util.Scanner;

public class BuyAction implements Actionable{
    @Override
    public void Execute(Machine machine) {
        var scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        var input = scanner.next();

        if(!input.equals("back")){
            var coffee = CoffeeFactory.CreateCoffee(Integer.parseInt(input));

            coffee.ProcessCoffee(machine);
        }
    }
}
