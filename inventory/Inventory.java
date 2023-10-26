package inventory;

import java.util.ArrayList;
import java.util.Random;

public class Inventory {
    private final ArrayList<Item> items;
    private final int maxNumberOfItemForType =3;
    private final int effectivenessBound=100;
    public Inventory(){
        items = new ArrayList<>();
    }
    public void setInventory(){
        setWeapons();
        setArmors();
        setPoison();
        setHealthPotion();
    }
    private void setWeapons(){
        Random rn=new Random();
        int weaponsNumber = rn.nextInt(maxNumberOfItemForType);
        for(int i=0; i<weaponsNumber; i++){

            items.add(new Weapon(rn.nextInt(effectivenessBound)));
        }
    }
    private void setArmors(){
        Random rn=new Random();
        int armorsNumber = rn.nextInt(maxNumberOfItemForType);
        for(int i=0; i<armorsNumber; i++){
            items.add(new Armor(rn.nextInt(effectivenessBound)));
        }
    }
    private void setPoison(){
        Random rn=new Random();
        int poisonNumber = rn.nextInt(maxNumberOfItemForType);
        for(int i=0; i<poisonNumber; i++){
            items.add(new Poison(rn.nextInt(effectivenessBound)));
        }
    }
    private void setHealthPotion(){
        Random rn=new Random();
        int healthPotionNumber= rn.nextInt(maxNumberOfItemForType);
        for(int i=0; i<healthPotionNumber; i++){
            items.add(new HealthPotion(rn.nextInt(effectivenessBound)));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb =new StringBuilder("Inventories: "+"\n");
        for(Item item: items){
                sb.append("    ").append(item.toString());
                sb.append("\n");
        }
        if(items.isEmpty()){
            sb.append("Inventory is empty");
        }
        return sb.toString();
    }
}
