package inventory;

public class Weapon extends Equipment{
    int attackPower;
    //Weapon has attack Power
    public Weapon(int power){
        this.attackPower=power;
    }
    public String toString(){
        return "    Weapon: with Attack power: "+attackPower;
    }
}
