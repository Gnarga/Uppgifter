public class TenNumbers {

  public int MathTester (int x) {

    // Smaller multiple
    int a = (x / 10) * 10;

    // Larger multiple
    int b = a + 10;

    // Return of closest of two
    return (x - a > b - x)? b : a;
  }

  public double MathTester2 (int x, int y) {
    double i = x;
    double j = (double) y /10;
    double temp = i+j;
    return temp;
  }
}
