import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name){
        this.name = name;
        performers = new ArrayList<Performer>();
    }

    public ArrayList<Performer> getPerformers(){
        return performers;
    }

    public String getName(){
        return name;
    }

    public boolean addPerformer(Performer a){
        if(performers.contains(a)){
            return false;
        }
        performers.add(a);
        return true;
    }

    public boolean removePerformer(Performer a){
        if(performers.contains(a)){
            performers.remove(a);
            return true;
        }
        return false;
    }

    public double averagePerformerAge(){
        double sum = 0;
        for(Performer a: performers){
            sum+= a.getAge();
        }
        return sum/performers.size();
    }

    public ArrayList<Performer> performersOverAge(int num){
        ArrayList<Performer> a = new ArrayList<Performer>();
        for(Performer b: performers){
            if(b.getAge() >= num){
                a.add(b);
            }
        }
        return a;
    }

    public void groupRehearsal(){
        for(Performer a: performers){
            System.out.println("REHEARSAL CALL! " + a.getName());
            if(a instanceof Comedian){
                Comedian newCom = (Comedian) a;
                newCom.rehearse(false);
            }
            else{
                a.rehearse();
            }
        }
    }

    public void cabaretShow(){
        for(Performer a: performers){
            System.out.println("Welcome to the cabaret! Next act up..." + a.getName());
            if(a instanceof Dancer){
                Dancer dance = (Dancer) a;
                dance.pirouette(2);
                dance.perform();
            }
            else{
                a.perform();
            }
        }
    }

}
