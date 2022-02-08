package machine;

import java.util.ArrayList;

public abstract class BaseCoffee {
    protected int requiredMilk;
    protected int requiredCoffee;
    protected int requiredWater;
    protected int cost;

    public BaseCoffee(int requiredMilk, int requiredCoffee, int requiredWater, int cost){
        this.requiredMilk = requiredMilk;
        this.requiredCoffee = requiredCoffee;
        this.requiredWater = requiredWater;
        this.cost = cost;
    }

    public void ProcessCoffee(Machine machine){
        var validationsErrors = isValidRequest(machine);
        if(validationsErrors.isEmpty()){
            System.out.println("I have enough resources, making you a coffee!");

            machine.setWater(machine.getWater() - requiredWater);
            machine.setMilk(machine.getMilk() - requiredMilk);
            machine.setCoffee(machine.getCoffee() - requiredCoffee);
            machine.setMoney(machine.getMoney() + cost);
            machine.setCups(machine.getCups() - 1);
        }
        else{
            displayErrors(validationsErrors);
        }
    }

    private void displayErrors(ArrayList<String> validationsErrors) {
        var errorMessage = new StringBuilder();

        errorMessage.append("Sorry, not enough");

        for (var error : validationsErrors) {
            errorMessage.append(String.format(" %s", error));
        }

        errorMessage.append("!");

        System.out.println(errorMessage.toString());
    }

    private ArrayList<String> isValidRequest(Machine machine) {
        var missingResources = new ArrayList<String>();

        if(machine.getWater() < requiredWater){
            missingResources.add("water");
        }

        if(machine.getMilk() < requiredMilk){
            missingResources.add("milk");
        }

        if(machine.getCoffee() < requiredCoffee){
            missingResources.add("coffee");
        }

        if(machine.getCups() == 0){
            missingResources.add("cups");
        }

        return missingResources;
    }
}
