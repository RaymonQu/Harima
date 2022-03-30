public class Pets
{
    private String name;
    private String species;

    public Pets(String n, String s)
    {
        name = n;
        species = s;
    }

    public String getName()
    {
        return name;
    }

    public void printPetInfo()
    {
        System.out.print(name + " is a " + species);
    }
}
