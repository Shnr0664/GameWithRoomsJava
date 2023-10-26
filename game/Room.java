package game;

import actors.Actor;
import actors.Enemy;
import actors.Player;
import inventory.Inventory;
import java.util.ArrayList;
import java.util.Random;

public class Room {
    private final int rowIndice;
    private final int columnIndice;
    private boolean playerIsInRoom;
    Player pl;
    ArrayList<Enemy> enemies;
    Inventory roomInventory;
    protected Room(int i, int j){
        enemies =new ArrayList<Enemy>();
        roomInventory =new Inventory();
        rowIndice=i;
        columnIndice=j;
    }
    protected void setInventory(){
        roomInventory.setInventory();
    }
    protected int setEnemies(int maxEnemyNum) {
        Random rand=new Random();

        int enemyNum = rand.nextInt(0,maxEnemyNum+1);
        for(int i=0; i<enemyNum; i++){
            enemies.add(new Enemy());
        }
        return maxEnemyNum-enemyNum;
    }
    protected void allocatePlayer(Player player){
        playerIsInRoom=true;
        this.pl=player;
    }
//    protected void playerLeftRoom(){
//        playerIsInRoom=false;
//    }

    public String toString(){
        StringBuilder sb=new StringBuilder("room: ");
        sb.append(rowIndice).append(" ");
        sb.append(columnIndice).append(" ").append("\n");
        sb.append("    ").append(roomInventory.toString());
        sb.append("    Actors:").append("\n");
        if(enemies.isEmpty()&& !playerIsInRoom){
            sb.append("      No actors in the room").append("\n\n");
        } else{
        for(Actor actor: enemies){
            sb.append("    ");
            sb.append(actor.toString()).append("\n");
        }
        if(playerIsInRoom){
                sb.append("    ");
                sb.append(pl.toString()).append("\n");
        }
        }
        return sb.toString();
 }
}
