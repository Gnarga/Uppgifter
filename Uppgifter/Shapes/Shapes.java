public class Shapes {

private String color;
 private boolean filled;

public Shapes () {
  }

public Shapes (String color, boolean filled) {
  setColor(color);
  setFilled(filled);
  }

public void setColor (String color) {
  this.color = color;
  }

public String getColor () {
  return color;
  }

public boolean getFilled () {
  return filled;
  }

public void setFilled (boolean filled) {
  this.filled = filled;
  }
}
