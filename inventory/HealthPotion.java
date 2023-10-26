package inventory;

public class HealthPotion extends Consumable{
    int healingPower;

    public HealthPotion(int healingPower) {
        this.healingPower = healingPower;
    }

    public String toString(){
        return "    HealthPotion: with Healing power: "+healingPower;
    }
}
