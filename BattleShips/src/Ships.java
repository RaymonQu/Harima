public class Ships {
    private int size;
    private boolean isDead;
    private boolean isHit;
    private String signifier;

    public Ships(int size){
        this.size = size;
        isDead = false;
        isHit = false;
        signifier = null;
    }


    public int getSize(){
        return size;
    }

    public void makeHit(){
        isHit = true;
    }

    public boolean isHit(){
        return isHit;
    }

    public void setDead(){
        isDead = true;
    }

    public boolean getStatus(){
        return isDead;
    }

    public void setSignifier(String letter){
        signifier = letter;
    }

}
