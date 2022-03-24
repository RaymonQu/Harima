public class Ships {
    private int size;
    private boolean isDead;
    private boolean isHit;

    public Ships(int size){
        this.size = size;
        isDead = false;
        isHit = false;
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

}
