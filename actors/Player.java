package actors;

import inventory.Inventory;

public class Player extends Actor{

    public Player(){
        super.actorInventory=new Inventory();
        this.actorInventory.setInventory();
    }

    @Override
    public void move() {
        if
    }

    public String toString() {
        return "  Player "+"\n        "+actorInventory.toString();
    }
}
