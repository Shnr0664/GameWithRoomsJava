package inventory;

public class Poison extends Consumable{
    int destroyPower;

    public Poison(int destroyPower) {
        this.destroyPower = destroyPower;
    }

    public String toString(){
        return "    Poison: with Destroy power: "+destroyPower;
    }
}
