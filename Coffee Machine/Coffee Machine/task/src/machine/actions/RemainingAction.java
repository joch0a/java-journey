package machine.actions;

import machine.Machine;

public class RemainingAction implements Actionable{
    @Override
    public void Execute(Machine machine) {
        machine.printState();
    }
}
