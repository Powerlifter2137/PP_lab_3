import geometry.*;
public class Main {
  public static void main(String[] args) {
      Point c = new Point(2, 3);
      ColoredCircle circle2 = new ColoredCircle(c, 3.0, "red");

      System.out.println(circle2.getCenter().getX() + " " + circle2.getCenter().getY());
      System.out.println(circle2.getRadius());
      System.out.println(circle2.calculatePerimeter());
      System.out.println(circle2.getColor());
  }
}