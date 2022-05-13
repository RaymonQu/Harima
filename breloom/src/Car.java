public class Car extends Vehicle {

    public Car(int wheels, String doorBrand, int horsePower, boolean airConditioning) {
        super(wheels, doorBrand, horsePower, airConditioning);
    }
    public void perform(){
        System.out.println("VROOOM I have " + getWheels() + " wheels. Am I air conditioned? " + isAirConditioning() +
                            " I have " + getHorsePower() + " horsePower. My doors are from " + getDoorBrand() + ". I am going " +
                            "to get some milk");
    }
}
