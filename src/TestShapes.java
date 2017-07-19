/**
 * this sample program is to demonstrate polymorphism.
 * abstract class & methods are not introduced yet
 */

public class TestShapes {

  public static void main(String[] args) {
    Circle c1 = new Circle(5, 5, 10);
    double area1 = c1.getArea();
    c1.setLocation(6, 6); // superclass method is called

    Shape gm; // not object creation;
    gm = c1; // gm and c1 point to the same object. OK since Circle *is-a* Shape
    double area = gm.getArea(); // polymorphism
    System.out.println("Radius of c1 = "+c1.getRadius());

    Rectangle r2; // not object creation
    Shape g1 = new Circle(10, 10, 5); // Parent = Child assignment is ok
    Shape g2 = new Rectangle(20, 20, 10, 20);

    System.out.println("Area= "+g1.getArea()); // use of polymorphism
    System.out.println("Area= "+g2.getArea()); // use of polymorphism
  }
}
