public class Main {
  public static void main(String[] args) {


    Rectangle r1 = new Rectangle(3, 4, "red", true);
    Circle c1 = new Circle(10);
    Square s1 = new Square(5.34);

    s1.setColor("blue");
    s1.setFilled(true);


    System.out.println(r1.toString());
    System.out.println(c1.toString());
    System.out.println(s1.toString());



  }
}
