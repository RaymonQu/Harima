public class Taxi extends Car {
  private double fareCollected;

  public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
    super(licensePlate, tollFee, passengers, isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
  }

  public boolean chargeAndDropOffRiders(double farePerRide){
    fareCollected += (getPassengers() - 1) * farePerRide;
    return dropOffPassengers(getPassengers() - 1);
  }

  @Override
  public void printInfo(){
    super.printInfo();
    System.out.println("Total fare collected? " + fareCollected);
  }

  public double getFareCollected(){
    return fareCollected;
  }
}