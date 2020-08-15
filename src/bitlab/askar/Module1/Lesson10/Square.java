package bitlab.askar.Module1.Lesson10;

public class Square extends Shape{


    double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width*width;
    }

    @Override
    public double getPreimeter() {
        return 4*width;
    }
}
