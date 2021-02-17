package basicOfOOP.basicOfOOP_4.treasure.swords;

import basicOfOOP.basicOfOOP_4.treasure.Treasure;

public class Sword extends Treasure {


    public Sword(int price, String description) {
        super(price, description);

    }

    @Override
    public String toString() {
        return "Sword: " +
                "price = " + getPrice() +
                ", description = " + getDescription() +'.'
                ;
    }
}
