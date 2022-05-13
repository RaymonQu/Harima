public class Point {

    private String label;
    private int x;
    private int y;

    public Point(String name, int x, int y){
        label = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "Label: " + label + "X: " + x + "Y: " + y;
    }

    @Override
    public boolean equals(Object point){
        if(!(point instanceof Point)){
            return false;
        }
        Point point2 = (Point) (point);
        return this.x == point2.getX() && this.y == point2.getY();
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
