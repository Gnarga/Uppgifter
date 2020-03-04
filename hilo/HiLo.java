import java.util.Scanner;

public class HiLo {
public static void main(String[] args) {

      System.out.println("Välkommen att spela HighLow");
      System.out.println("Välj en svårighetsgrad:");
      System.out.println("1. Lätt (1-10)");
      System.out.println("2. Mellan (1-100)");
      System.out.println("3. Svårt (1-1000)");

      Scanner scanner = new Scanner(System.in);


   int game = scanner.nextInt();
   if (game == 1) {
      playGame(10);
   } else if (game == 2) {
      playGame(100);
   } else if (game == 3) {
      playGame(1000);
   } else {
      System.out.println("Fel input");

   }
}

public static int playGame(int maxNumber) {
      Scanner scanner = new Scanner(System.in);

      int counter = 0;
      int number = (int)(Math.random() * maxNumber) +1;
      int guess;
      System.out.println("Gissa på ett nummer mellan 1-"+maxNumber);
   do {


      guess = scanner.nextInt();
       counter++;
   if (guess < number) {
      giveResponse(number, guess);


   } else if (guess > number) {
      giveResponse(number, guess);

   }

 } while (guess != number);
      System.out.println("Härligt, du gissade rätt nummer!");
      System.out.println("Du klarade det på bara " + counter + " försök!");

   return guess;
}

public static void giveResponse(int answer, int guess) {

   if (guess < answer) {
      System.out.println("Din gissning var för låg.");
   } else if (guess > answer) {
      System.out.println("Din gissning var för hög");
   }


}
}
