public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    bicycle newBicycle = new bicycle("werid", 2, 8);
    newBicycle.ringBell();
    System.out.println(newBicycle.getName());
    System.out.println(newBicycle.getWheels());
    System.out.println(newBicycle.getGearCount());
    newBicycle.turn(10);
    newBicycle.move(24);
    newBicycle.brake(.5);

    Unicycle newUnicycle = new Unicycle("toad", 1, false);
    newUnicycle.hop();
    System.out.println(newUnicycle.getName());
    System.out.println(newUnicycle.getWheels());
    System.out.println(newUnicycle.isCanJump());
    newUnicycle.turn(20);
    newUnicycle.move(0);
    newUnicycle.brake(.1);
  }
}