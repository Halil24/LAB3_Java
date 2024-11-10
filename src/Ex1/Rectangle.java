package Ex1;

public class Rectangle {
    private double width=1;
    private double height=1;
    public Rectangle(){}
public Rectangle(double w, double h)
{
        width=w;
        height=h;
}

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        width=w;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height=h;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*width+2*height;
    }

}
