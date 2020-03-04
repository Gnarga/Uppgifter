import java.util.*;

public class TextLengthCompare {
  public static void main (String[]args) {

    Scanner userInput = new Scanner(System.in);
    System.out.println("\nType something for in honor of Tengil, our master!");
    String textTwo = "";
    boolean running = true;
    String textOne = userInput.nextLine();
    if (textOne.equals("")) {
      System.out.println("\nEnter something dammit!");
      textOne = userInput.nextLine();
    }
    ArrayList <String> list = new ArrayList <String>();
    if (textOne.length()>textTwo.length()) {
      list.add(textOne);
    }else {
      System.out.println("\nEnter something dammit!");
    }
    textTwo = textOne;
    System.out.println("\nAnd now praise him in a longer sentence!\n");
    do {
      textOne = userInput.nextLine();
    if (textOne.length()>textTwo.length()) {
      list.add(textOne);
      System.out.println("\nAnd now praise him in a longer sentence!\n");
    }else {
      System.out.println("\nNo you heathen! You were supposed to praise him more!");
      System.out.println("You did atleast praised him in these ways :  \n");
      for (int i = 0; i < list.size(); i++) {
      System.out.println("'"+ list.get(i) + "'");
    }
      running = false;
    } textTwo = textOne;
    } while (running);
  }
}
