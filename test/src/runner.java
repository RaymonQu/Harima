import java.util.ArrayList;

public class runner {
    public static void main(String[] args) {
        ArrayList<Pets> petList = new ArrayList<Pets>();

        Pets rab = new Pets("Floppy", "rabbit");
        dog dogy = new dog("Arty", "Pug");

        petList.add(rab);
        petList.add(dogy);
        PetOwner owner1 = new PetOwner(rab, "Jerry");
        owner1.printOwnerInfo();
        PetOwner owner2 = new PetOwner(dogy, "Kris");
        owner2.printOwnerInfo();


    }
}
