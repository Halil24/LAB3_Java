package Ex1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3]; //array to store the references to the objects
        rectangles[0] = new Rectangle(4,40); //rectangle 1
        rectangles[1] = new Rectangle(3.5,35.9); //rectangle 2
        rectangles[2]= new Rectangle(); //default rectangle extra

        for(Rectangle rectangle:rectangles){
            System.out.printf("%-12s %-10.2f %-10.2f\n", "Rectangle", rectangle.getArea(),rectangle.getPerimeter());

            //number in front of point is number of digits before floating point
            //number after floating point is number of digits after floating point.
            //"-" is used to align the values to the left.
            //"+" to display neg and pos numbers with sign on front of them.
            //"(" to
            //"'" to separate in tens, hundreds, thousands etc.


        }
    }
}
