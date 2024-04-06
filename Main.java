import geometry.*;
public class Main {
  public static void main(String[] args) {
      Point c = new Point(2, 3);
      Circle circle1 = new Circle(c, 3.0);

      System.out.println(circle1.getCenter().getX() + " " + circle1.getCenter().getY());
      System.out.println(circle1.getRadius());
      System.out.println(circle1.calculatePerimeter());
  }
}