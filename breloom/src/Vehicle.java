abstract class Vehicle {
    private int wheels;
    private String doorBrand;
    private int horsePower;
    private boolean airConditioning;

    public Vehicle(int wheels, String doorBrand, int horsePower, boolean airConditioning) {
        this.wheels = wheels;
        this.doorBrand = doorBrand;
        this.horsePower = horsePower;
        this.airConditioning = airConditioning;
    }

    public abstract void perform();

    public int getWheels(){
        return wheels;
    }

    public String getDoorBrand(){
        return doorBrand;
    }

    public int getHorsePower(){
        return horsePower;
    }

    public boolean isAirConditioning(){
        return airConditioning;
    }
}
