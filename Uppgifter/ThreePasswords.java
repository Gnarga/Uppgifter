import java.util.*;

public class Test {
  public static void main (String[]args) {

    for (int i = 5; i>0; i--) {
      System.out.println("Ahoy there mate! Enter the three sacred words!");
      System.out.println("You have " + i + " attemps left");
      boolean password =  isAuthorised();
      if (password) {
        if (i == 1) {
          System.out.println("Phew, close call!");
      }else{
        System.out.println("Enter master!");
        System.exit(0);
    }
  }else if (i == 0 ) {
      System.out.println("User deleted.");
      System.out.println("Get yourself together! Yeez..");
      System.exit(0);
    }
  }
}

  public static boolean  isAuthorised() {
    Scanner input = new Scanner (System.in);
    boolean passOne = false;
    boolean passTwo = false;
    boolean passThree = false;
    boolean pass = false;

      String one = input.nextLine();
      String two = input.nextLine();
      String three = input.nextLine();

        if (one.equals("ett") || (one.equals("två") || (one.equals("tre")))) {
        passOne = true;
      }

        if (two.equals("ett") || (two.equals("två") || (two.equals("tre")))) {
          passTwo = true;
            if (two.equals(one) || (two.equals(three))) {
              passTwo = false;
            }
          }

            if (three.equals("ett") || (three.equals("två") || (three.equals("tre")))) {
              passThree = true;
                if (three.equals(one) || (three.equals(two))) {
                  passThree = false;
        }
      }
      if  (passOne&&passTwo&&passThree == true) {
        pass = true;
      }
        return pass;
  }
}
