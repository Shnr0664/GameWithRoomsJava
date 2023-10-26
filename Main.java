import actors.Player;
public class Main {

    public static void main(String[] args) {
        Player player =new Player();
        Game newGame=new Game(3,2,3,player);
        newGame.start();


    }
}
