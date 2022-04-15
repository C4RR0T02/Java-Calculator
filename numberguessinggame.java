import java.util.*;

public class numberguessinggame {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            NumberGuessingGameMenu();
            System.out.print("Enter option: ");
            String choice = myObj.nextLine();
            switch (choice) {
                case "0" -> exit = false;
                case "1" -> EasyMode();
                case "2" -> HardMode();
                case "3" -> ImpossibleMode();
                default -> System.out.println("Enter a valid input");
            }
        }
    }
    
    public static void NumberGuessingGameMenu() {
        System.out.println("Number Guessing Game Menu");
        System.out.println("-----------------------------------");
        System.out.println("1. Easy Mode - Unlimited Attempts");
        System.out.println("2. Hard Mode - 10 Attempts");
        System.out.println("3. Impossible Mode - 5 Attempts");
        System.out.println("0. Exit");
    }


    public static void EasyMode() {
        Random rand = new Random();
        Scanner myObj = new Scanner(System.in);
        int upperbound = 101;
        int int_random = rand.nextInt(upperbound);
        int guess = 101;
        int guessnum = 1;
        while (true) {
            if (guessnum == 1) {
                System.out.println("Welcome to number guessing game Easy Mode");
                System.out.println("The integer is in the range of 0 and 100");
                System.out.print("Guess a number: ");
                guess = Integer.parseInt(myObj.nextLine());
                if (guess > 100) {
                    System.out.println("The integer is in the range of 0 and 100");
                }
                else if (guess == int_random) {
                    System.out.println("Congrats! you got it. The number was " + int_random);
                    System.out.println("The number was guessed in " + guessnum + " of tries.");
                    System.out.println("");
                    break;
                }
                else {
                    HigherLowerCheck(int_random, guess);
                    System.out.println("Guess Again!");
                    guessnum += 1;
                    System.out.println("");
                    System.out.print("Guess a number: ");
                    guess = Integer.parseInt(myObj.nextLine());
                }
            }
            else {
                if (guess > 100) {
                    System.out.println("The integer is in the range of 0 and 100");
                }
                else if (guess == int_random){
                    System.out.println("Congrats! you got it. The number was " + int_random);
                    System.out.println("The number was guessed in " + guessnum + " of tries.");
                    System.out.println("");
                    break;
                }
                else {
                    HigherLowerCheck(int_random, guess);
                    System.out.println("Guess Again!");
                    guessnum += 1;
                    System.out.println("");
                    System.out.print("Guess a number: ");
                    guess = Integer.parseInt(myObj.nextLine());
                }
            }
        }
    }


    public static void HardMode() {
        Random rand = new Random();
        Scanner myObj = new Scanner(System.in);
        int upperbound = 101;
        int int_random = rand.nextInt(upperbound);
        int guess = 101;
        int guessnum = 1;
        while (guessnum < 11) {
            if (guessnum == 1) {
                System.out.println("Welcome to number guessing game Hard Mode");
                System.out.println("You have 10 tries");
                System.out.println("The integer is in the range of 0 and 100");
                System.out.print("Guess a number: ");
                guess = Integer.parseInt(myObj.nextLine());
                if (guess > 100) {
                    System.out.println("The integer is in the range of 0 and 100");
                }
                else if (guess == int_random) {
                    System.out.println("Congrats! you got it. The number was " + int_random);
                    System.out.println("The number was guessed in " + guessnum + " of tries.");
                    System.out.println("");
                    guessnum = 13;
                }
                else {
                    HigherLowerCheck(int_random, guess);
                    System.out.println("Guess Again!");
                    guessnum += 1;
                    System.out.println("");
                    System.out.print("Guess a number: ");
                    guess = Integer.parseInt(myObj.nextLine());
                }
            }
            else {
                if (guess > 100) {
                    System.out.println("The integer is in the range of 0 and 100");
                }
                else if (guess == int_random){
                    System.out.println("Congrats! you got it. The number was " + int_random);
                    System.out.println("The number was guessed in " + guessnum + " of tries.");
                    System.out.println("");
                    guessnum = 13;
                }
                else {
                    HigherLowerCheck(int_random, guess);
                    System.out.println("Guess Again!");
                    guessnum += 1;
                    System.out.println("");
                    System.out.print("Guess a number: ");
                    guess = Integer.parseInt(myObj.nextLine());
                }
            }
        }
        System.out.println("Thank You for Playing! The number was " + int_random);
    }


    public static void ImpossibleMode() {
        Random rand = new Random();
        Scanner myObj = new Scanner(System.in);
        int upperbound = 101;
        int int_random = rand.nextInt(upperbound);
        int guess = 101;
        int guessnum = 1;
        while (guessnum < 6) {
            if (guessnum == 1) {
                System.out.println("Welcome to number guessing game Impossible Mode");
                System.out.println("You have 5 attempts");
                System.out.println("The integer is in the range of 0 and 100");
                System.out.print("Guess a number: ");
                guess = Integer.parseInt(myObj.nextLine());
                if (guess > 100) {
                    System.out.println("The integer is in the range of 0 and 100");
                }
                else if (guess == int_random) {
                    System.out.println("Congrats! you got it. The number was " + int_random);
                    System.out.println("The number was guessed in " + guessnum + " of tries.");
                    System.out.println("");
                    guessnum = 13;
                }
                else {
                    HigherLowerCheck(int_random, guess);
                    System.out.println("Guess Again!");
                    guessnum += 1;
                    System.out.println("");
                    System.out.print("Guess a number: ");
                    guess = Integer.parseInt(myObj.nextLine());
                }
            }
            else {
                if (guess > 100) {
                    System.out.println("The integer is in the range of 0 and 100");
                }
                else if (guess == int_random){
                    System.out.println("Congrats! you got it. The number was " + int_random);
                    System.out.println("The number was guessed in " + guessnum + " of tries.");
                    System.out.println("");
                    guessnum = 13;
                }
                else {
                    HigherLowerCheck(int_random, guess);
                    System.out.println("Guess Again!");
                    guessnum += 1;
                    System.out.println("");
                    System.out.print("Guess a number: ");
                    guess = Integer.parseInt(myObj.nextLine());
                }
            }
        }
        System.out.println("Thank You for Playing! The number was " + int_random);
    }


    public static void HigherLowerCheck(int random, int guess) {
        if (random > guess){
            System.out.println("Guess Higher!");
        }
        else {
            System.out.println("Guess Lower!");
        }
    }

}
