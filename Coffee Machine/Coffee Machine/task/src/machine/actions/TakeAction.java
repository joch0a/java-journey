package machine.actions;

import machine.Machine;

public class TakeAction implements Actionable {
    @Override
    public void Execute(Machine machine) {
        System.out.println(String.format("I gave you $%s", machine.getMoney()));

        machine.setMoney(0);
    }
}
