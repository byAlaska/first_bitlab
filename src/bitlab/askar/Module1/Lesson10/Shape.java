package bitlab.askar.Module1.Lesson10;

public abstract class Shape {

    int angle;



    public abstract double getArea();
    public abstract double getPreimeter();



    public int getAngle(){
        return angle;
    }

    public void setAngle(int angle){
        this.angle = angle;
    }

}
