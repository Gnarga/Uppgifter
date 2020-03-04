public class Square extends Rectangle {
private double side;
public Square () {
  this(0);
}

public Square (double side) {
  this(side, null, false);
}

public Square(double side, String color, boolean filled) {
  setSide(side);
  super.setColor(color);
  super.setFilled(filled);
}

public void setSide (double side) {
  setWidth(side);
  setLenght(side);
}

public double getSide () {
  return side;
}

public  void setWidth (double side) {
  super.setWidth(side);
}

public void setLenght (double side) {
super.setLenght(side);

}
  public String toString() {
    return "The squares area is " + super.getArea() + ", with a perimeter of  " + super.getPerimeter()
    +"\nColor : "+ super.getColor()+ ", filled : " + super.getFilled();

}
}
