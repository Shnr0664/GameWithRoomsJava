package actors;

import inventory.Inventory;

public class Player extends Actor{

    public Player(){
        super.actorInventory=new Inventory();
        this.actorInventory.setInventory();
    }
    public String toString() {
        return "  Player "+"\n        "+actorInventory.toString();
    }
}
