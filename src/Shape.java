/**
 * superclass of rectangle and circle
 */
public class Shape {

  public Shape() {
    x = y = 0;
  }

  public Shape(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void setLocation(double x, double y) {
    this.x = x;
    this.y = y;
  }

  
  public double getArea() { // area cannot be define here
    return -1.0;
  }
  
  private double x;
  private double y;
}
