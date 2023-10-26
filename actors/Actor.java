package actors;

import inventory.Inventory;

public abstract class Actor {
    Inventory actorInventory;

    @Override
    public abstract String toString();
}
