import java.util.ArrayList;

public class Player {
    private Board board;
    private ArrayList<Ships> boats;

    public Player(){
        board = new Board();
        boats = new ArrayList<Ships>();
    }

    public Board getBoard(){
        return board;
    }

}
