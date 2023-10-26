import actors.Player;
import game.GameMap;

public class Game {
    private final Player player;
    private final GameMap map;
    public Game(int width, int height, int maxEnemies, Player player){
    this.player=player;
    this.map =new GameMap(width,height,maxEnemies);
    }
    public void start(){
        map.setRooms();
        map.allocatePlayer(player);
        map.printMap();
    }
    public void printMap(){
        map.printMap();
    }
}
