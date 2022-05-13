public class Plane extends Vehicle {

    public Plane(int wheels, String doorBrand, int horsePower, boolean airConditioning) {
        super(wheels, doorBrand, horsePower, airConditioning);
    }

    public void perform(){
        System.out.println("GET READY FOR YOUR FLIGHT TO THE MALDIVES");
    }

}
