
public class PetOwner
{
    private Pets thePet;
    private String owner;

    public PetOwner(Pets p, String o)
    {
        thePet = p;
        owner = o;
    }

    public void printOwnerInfo()
    {
        thePet.printPetInfo();
        System.out.print(" owned by " + owner);
    }
}
