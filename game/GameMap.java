package game;

import actors.Player;

import java.util.ArrayList;
import java.util.Random;

public class GameMap {
    private final ArrayList<ArrayList<Room>> rooms;
    private final int maxEnemies;
    public GameMap(int width, int height, int maxEnemies){
        rooms=new ArrayList<>(height);
        for(int i=0;i<height;i++){
            rooms.add(new ArrayList<>(width));
        }
        for(int i=0;i<height;i++){
            for(int j=0; j<width;j++){
                rooms.get(i).add(new Room(i, j));
            }
        }
        this.maxEnemies=maxEnemies;
    }
    public void allocatePlayer(Player player){
        Random rand =new Random();
        int roomColumn=rand.nextInt(0, rooms.size()-1);
        int roomRow=rand.nextInt(0, rooms.size()-1);
        rooms.get(roomRow).get(roomColumn).allocatePlayer(player);
    }
    public void setRooms(){
        int numOfEnemiesToAllocate=maxEnemies;
        for(ArrayList<Room> list: rooms){
            for(Room rm:list){
                numOfEnemiesToAllocate=rm.setEnemies(numOfEnemiesToAllocate);
                rm.setInventory();
            }
        }
    }
    public void printMap(){
        for(ArrayList<Room> list: rooms){
            for(Room rm:list){
                System.out.print(rm.toString());
            }
        }
    }
}
