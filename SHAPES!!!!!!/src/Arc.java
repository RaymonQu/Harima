import java.awt.Graphics;

public class Arc extends Shape{
    private int startingAngle;
    private int arcAngle;

    public Arc(){
        super();
        startingAngle = 45;
        arcAngle = 60;
    }



    @Override
    public void draw(Graphics g){
        g.setColor(getColor());
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startingAngle, arcAngle);
    }
}
