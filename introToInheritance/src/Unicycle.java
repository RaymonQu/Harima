public class Unicycle extends Vehicle{
    private boolean canJump;

    public Unicycle (String name, int wheels, boolean canJump){
        super(name, wheels);
        this.canJump = canJump;
    }

    public void hop(){
        System.out.println("bop");
        if(!canJump){
            System.out.println("the wheel deflates");
        }
    }

    public boolean isCanJump(){
        return canJump;
    }
}
