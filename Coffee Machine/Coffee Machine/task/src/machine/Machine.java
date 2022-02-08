package machine;

import machine.factories.ActionsFactory;

public class Machine {
    private int water = 400;
    private int milk = 540;
    private int coffee = 120;
    private int cups = 9;
    private int money = 550;

    private final String BUY = "buy";
    private final String FILL = "fill";
    private final String TAKE = "take";

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void printState(){
        System.out.println("The coffee machine has:");
        System.out.println(String.format("%s ml of water", water));
        System.out.println(String.format("%s ml of milk", milk));
        System.out.println(String.format("%s g of coffee beans", coffee));
        System.out.println(String.format("%s disposable cups", cups));
        System.out.println(String.format("$%s of money", money));
    }

    public void askAction(){
        System.out.println("Write action (buy, fill, take, remaining, exit):");
    }

    public void ProcessInput(String userInput){
        var action = ActionsFactory.CreateAction(userInput);

        action.Execute(this);
    }
}
