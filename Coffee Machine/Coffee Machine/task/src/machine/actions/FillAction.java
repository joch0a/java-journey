package machine.actions;

import machine.Machine;

import java.util.Scanner;

public class FillAction implements Actionable{
    @Override
    public void Execute(Machine machine) {
        var scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add:");
        machine.setWater(machine.getWater() + scanner.nextInt());

        System.out.println("Write how many ml of milk you want to add: ");
        machine.setMilk(machine.getMilk() + scanner.nextInt());

        System.out.println("Write how many grams of coffee beans you want to add: ");
        machine.setCoffee(machine.getCoffee() + scanner.nextInt());

        System.out.println("Write how many disposable cups of coffee you want to add:");
        machine.setCups(machine.getCups() + scanner.nextInt());
    }
}
