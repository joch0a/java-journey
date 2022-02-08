package machine.factories;

import machine.actions.*;

public class ActionsFactory {
    private static final String BUY = "buy";
    private static final String FILL = "fill";
    private static final String TAKE = "take";
    private static final String REMAINING = "remaining";

    public static Actionable CreateAction(String action){
        switch (action){
            case BUY:
                return new BuyAction();
            case FILL:
                return new FillAction();
            case TAKE:
                return new TakeAction();
            case REMAINING:
                return new RemainingAction();
        }

        return null;
    }
}
