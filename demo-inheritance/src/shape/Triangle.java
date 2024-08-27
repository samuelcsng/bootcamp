package shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape {
  // base, height
  private double base;
  private double height;

  // either use this() or super()
  public Triangle(double base, double height) {
    super();
    this.base = base;
    this.height = height;
  }

  // either use this() or super()
  public Triangle(double base, double height, Color color) {
    super(color);
    // this(base, height);
    // super(color);
    this.base = base;
    this.height = height;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.base) //
        .multiply(BigDecimal.valueOf(height)) //
        .divide(BigDecimal.valueOf(2.0d), 2, RoundingMode.HALF_UP) //
        // .multiply(BigDecimal.valueOf(0.5)) //
        .doubleValue();
  }

  public static void main(String[] args) {
    Triangle triangle = new Triangle(2.55, 3.0);
    System.out.println(triangle.area()); // 3.825 -> 3.83

    Triangle t2 = new Triangle(3.0, 4.0, Color.RED);
    System.out.println(t2.getColor()); // RED);





  } // end of main()
}
