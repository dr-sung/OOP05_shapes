/**
 * a circle class: subclass of shape
 */
public class Circle extends Shape {

  public Circle(double radius) {
    this(0, 0, radius);
  }

  public Circle(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public double getArea() {
    return radius * radius * Math.PI;
  }

  private double radius;
}
