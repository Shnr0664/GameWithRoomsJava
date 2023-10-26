package inventory;

public class Armor extends Equipment{
    int defencePower;

    public Armor(int defencePower) {
        this.defencePower = defencePower;
    }

    public String toString(){
        return "    Armor: with Defence Power "+defencePower;
    }
}
