/**
 * rectangle class: subclass of shape
 */
public class Rectangle extends Shape {

  public Rectangle(double width, double height) {
    this(0, 0, width, height);
  }

  public Rectangle(double x, double y, double width, double height) {
    super(x, y); // You need to do if you want
    //to call other than default super constructor
    this.width = width;
    this.height = height;
  }

  public void setSize(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double getArea() {
    return width * height;
  }

  private double width;
  private double height;
}
