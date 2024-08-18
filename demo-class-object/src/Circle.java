public class Circle {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  // Presentation
  public double area() {
    return Math.pow(this.radius, 2) * Math.PI;
  }

  public static void main(String[] args) {
    Circle circle = new Circle(2.0);
    System.out.println(circle.area()); // 12.566370614359172
  }
}
