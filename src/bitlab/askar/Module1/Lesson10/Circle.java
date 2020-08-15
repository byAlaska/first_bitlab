package bitlab.askar.Module1.Lesson10;

public class Circle extends Shape {


    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return radius*radius*3.14;
    }

    @Override
    public double getPreimeter() {
        return 2*3.14*radius;
    }
}
