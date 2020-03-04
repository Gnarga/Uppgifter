import java.util.Scanner;

public class MultiplicationTable {
  public static void main(String[] args) {

     printMultiplicationTable();
}


public static void printMultiplicationTable() {
  Scanner userInput = new Scanner(System.in);
    System.out.print("Enter a number : ");
      int input =userInput.nextInt();
      System.out.println();
        for (int i=1; i<=10; i++) {
          System.out.println(input*i);
    }
  }
}
