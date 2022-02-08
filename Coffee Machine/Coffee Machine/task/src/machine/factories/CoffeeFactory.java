package machine.factories;

import machine.BaseCoffee;
import machine.Cappuccino;
import machine.Espresso;
import machine.Latte;

public class CoffeeFactory {
    private static final int ESPRESSO = 1;
    private static final int LATTE = 2;
    private static final int CAPPUCCINO = 3;

    public static BaseCoffee CreateCoffee(int coffeeCode){
        switch (coffeeCode){
            case ESPRESSO:
                return new Espresso();
            case LATTE:
                return new Latte();
            case CAPPUCCINO:
                return new Cappuccino();
        }

        return null;
    }
}
