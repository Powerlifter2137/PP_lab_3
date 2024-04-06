import geometry.*;
public class Main {
  public static void main(String[] args) {
      Circle[] circles = new Circle[3];
        circles[0] = new Circle(new Point(2, 6), 2);
        circles[1] = new Circle(new Point(1, 4), 1.0);
        circles[2] = new Circle(new Point(-1, 4), 5.0);

        ColoredCircle[] coloredCircles = new ColoredCircle[3];
        coloredCircles[0] = new ColoredCircle(new Point(3, 7), 2.0, "red");
        coloredCircles[1] = new ColoredCircle(new Point(0, 5), 1.5, "blue");
        coloredCircles[2] = new ColoredCircle(new Point(-2, -1), 4, "green");

        for (Circle circle : circles) {
            System.out.println("pole: " + circle.calculateArea());
        }

        for (ColoredCircle coloredCircle : coloredCircles) {
            System.out.println("pole: " + coloredCircle.calculateArea());
            System.out.println("kolor: " + coloredCircle.getColor());
        }
  }
}