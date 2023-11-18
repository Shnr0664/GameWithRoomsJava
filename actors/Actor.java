package actors;

import inventory.Inventory;

public abstract class Actor {
    Inventory actorInventory;
    public abstract void move();

    @Override
    public abstract String toString();
}
