public class bicycle extends Vehicle {
    private int gearCount;

    public bicycle(String name, int wheels, int gearCount){
        super(name, wheels);
        this.gearCount = gearCount;
    }

    public void ringBell(){
        System.out.println("ting");
    }

    public int getGearCount() {
        return gearCount;
    }
}
