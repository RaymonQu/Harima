import java.util.ArrayList;
import java.util.Collections;

public class runner {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        ArrayList<Garden> plants = new ArrayList<Garden>();

        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        plants.add(new Garden());
        plants.add(new Garden());
        plants.add(new Garden());
        plants.add(new Garden());
        plants.add(new Garden());
        plants.add(new Garden());
        plants.add(new Garden());
        plants.add(new Garden());

        for(Dog dog: dogs){
            dog.giveWater();
        }

        for(Garden dog: plants){
            dog.giveWater();
        }

        ArrayList<Cow> cows = new ArrayList<Cow>();

        cows.add(new Cow(10, "jacb"));
        cows.add(new Cow(10, "elmo"));
        cows.add(new Cow(15, "Bert"));
        cows.add(new Cow(4, "ERNIE"));

        Collections.sort(cows);
        for(Cow c: cows){
            System.out.println(c);
        }
    }
}
