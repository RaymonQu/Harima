public class Cow implements Comparable{

    private int age;
    private int milkInLiters;
    private String name;

    public Cow(int milk, String name){
        age = 10;
        milkInLiters = milk;
        this.name = name;
    }

    public int compareTo(Object t){
        Cow temp = (Cow) t;
        if(temp.milkInLiters < this.milkInLiters){
            return 1;
        }
        if(temp.milkInLiters > this.milkInLiters){
            return -1;
        }
        return 0;
    }

    public String toString(){
        return name;
    }

}
