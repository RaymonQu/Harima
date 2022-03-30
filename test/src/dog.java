public class dog extends Pets{
    private String breed;

    public dog(String name, String breed){
        super(name, "Dog");
        this.breed = breed;
    }

    @Override
    public void printPetInfo(){
        super.printPetInfo();
        System.out.print(" of breed " + breed);
    }
}

