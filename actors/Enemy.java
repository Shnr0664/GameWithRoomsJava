package actors;

import inventory.Inventory;

public class Enemy extends Actor{
    public Enemy(){
        super.actorInventory = new Inventory();
        this.actorInventory.setInventory();
    }
    @Override
    public String toString() {
        return "  Enemy \n"+"        "+actorInventory.toString();
    }
}
