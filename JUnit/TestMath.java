import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMath {

  @Test
  public void MathTest () {
    TenNumbers numbers = new TenNumbers();

    assertEquals(10,numbers.MathTester(5));
    System.out.println(numbers.MathTester(9)); //ska skriva ut 10
    assertEquals(20,numbers.MathTester(17));
    System.out.println(numbers.MathTester(17));//ska skriva ut 20
    assertEquals(340, numbers.MathTester(336));
    System.out.println(numbers.MathTester(336));
  }

  // @Test
  //   public void MathTest2 () {
  //     TenNumbers numbers = new TenNumbers();
  //
  //     assertEquals(3.4, numbers.MathTester2(3,4), 0.0); // ska bli 3,4
  //     assertEquals(5.2, numbers.MathTester2(5,3), 0.0);
  //   }
}
