public class Circle extends Shapes {

private double radius;

public Circle() {
  this(0);
}

public Circle (double radius) {
  this(radius, null, false);
}

public Circle (double radius, String color, boolean filled) {
  setRadius(radius);
  super.setColor(color);
  super.setFilled(filled);
}

public void setRadius(double radius) {
  this.radius = radius;
}

public double getRadius () {
  return radius;
}

public double getArea () {
  double area = Math.PI * Math.pow(radius, 2);
  return area;
}

public double getPerimeter () {
  double perimeter = Math.PI * 2 * radius;
  return  perimeter;
}

public String toString() {
  return "Circle, Area : " + getArea() + " Perimeter : " + getPerimeter() + ", with a radius of  : " + radius +
  "\nColor : " + super.getColor() + ", Filled : " + super.getFilled() +"\n";
}

}
