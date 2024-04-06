public class Main {
  public static void main(String[] args) {
    Point newpoint = new Point(3, 5);
    System.out.println(newpoint.getX());
    System.out.println(newpoint.getY());
  }
}
class Point {
  private double x,y;

  public Point(double x2, double y2){
    x = x2;
    y = y2;
  }

  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public void setX(double x3){
    x = x3;
  }
  public void setY(double y3){
    y = y3;
  }
} 