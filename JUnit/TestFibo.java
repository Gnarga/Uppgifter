import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFibo {

  @Test
    public void TestFib () {
      Fibo fibo = new Fibo();
      for (int x = 0; x <= 10; x++)
      System.out.println(fibo.fib(x));

  }
}
