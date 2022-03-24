public class Board {
    private String[][] Board;
    private boolean sneakyMode;

    public Board(){
        Board = new String[10][10];
        sneakyMode = false;
    }

    public void createBoard(){
        for(int i = 0; i < 10; i++){
            for (int k = 0; k < 10; k++){
                if(k == 10){

                }
                else {
                    Board[i][k] = "_|";
                }
            }
        }
    }

    public void setSneakyMode(boolean difficulty){
        sneakyMode = difficulty;
    }
}
