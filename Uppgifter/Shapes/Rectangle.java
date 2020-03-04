public class Rectangle extends Shapes {

private  double width;
private  double lenght;

  public Rectangle() {
    this(0, 0);
  }

  public Rectangle (double width, double lenght) {
    this(width, lenght, null, false);
  }

  public Rectangle (double width, double lenght, String color, boolean filled) {
    setWidth(width);
    setLenght(lenght);
    super.setColor(color);
    super.setFilled(filled);
  }

  public void setWidth (double width) {
    this.width = width;
  }

  public double getWidth (){
    return width;
  }

  public void setLenght (double lenght) {
    this.lenght = lenght;
  }

  public double getLenght () {
    return lenght;
  }

public double getArea() {
  double area =  width * lenght;
  return area;
}

public double getPerimeter (){
  double perimeter = width * 2 + lenght * 2;
  return perimeter;
}

public String toString () {
  return "Rectangle, Area : " + getArea() + ", Perimeter : " + getPerimeter() + "\nColor : "
+ super.getColor() + ", Filled : " + super.getFilled() + "\n";
}

}
