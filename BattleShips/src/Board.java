import java.util.ArrayList;
import java.util.Locale;

public class Board {
    private String[][] Board;
    private String[][] hiddenBoard;


    public Board(){
        Board = new String[10][10];
    }

    public void createBoard(){
        for(int i = 0; i < 10; i++){
            for (int k = 0; k < 10; k++){
                Board[i][k] = "-";
            }
        }
    }

    public void printBoard(){
        String[] arr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        int counter = 0;
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for(String[] listODashes: Board){
            System.out.print(arr[counter] + " ");
            counter++;
            for(String realDashes: listODashes){
                System.out.print(realDashes + " ");
            }
            System.out.println();
        }
    }

    public void putShipsOnBoard(Ships ship, int row, int column, String direction){
        int counter;
        if (direction.toUpperCase().equals("E")) {
            counter = row;
            while (row - ship.getSize() > 0) {
                for(int i = 0; i < ship.getSize(); i++){
                    Board[counter][column] = ship.getSignifier();
                    counter--;
                }
            }
        }
        else if(direction.toUpperCase().equals("W")){
            counter = row;
            while (row + ship.getSize() < 10) {
                for(int i = 0; i < ship.getSize(); i++){
                    Board[counter][column] = ship.getSignifier();
                    counter++;
                }
            }
        }
        else if(direction.toUpperCase().equals("N")){
            counter = column;
            while (column + ship.getSize() < 10) {
                for(int i = 0; i < ship.getSize(); i++){
                    Board[row][counter] = ship.getSignifier();
                    counter++;
                }
            }
        }
        else if(direction.toUpperCase().equals("S")){

        }
    }


    public void setMissOrHit(int row, int column){
        if(Board[row][column] == "B"){
            Board[row][column] = "X";
        }
        else{
            Board[row][column] = "O";
        }
    }

}
