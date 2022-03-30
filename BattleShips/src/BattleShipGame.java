import java.util.Scanner;

public class BattleShipGame {
    private Player player;
    private Player player2;
    private Scanner scan;
    private boolean gameOver;

    public BattleShipGame(){
        player = new Player();
        player2 = new Player();
        scan = new Scanner(System.in);
    }

    //make ai, make game
    public void start(){
        System.out.println("             BATTLE SHIP\n\n\n\n        Press Enter to Start");
        scan.nextLine();
        System.out.println("This is your board. Where would you like to place your 2 tile long destroyer?");
        player.getBoard().createBoard();
        player.getBoard().printBoard();
    }


    public void shoot(int row, int column){
        player2.getBoard().setMissOrHit(row, column);
    }

    public

}
