import java.lang.Math;
import java.util.*;

public class Main {


    public static void clearConsole() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            Menu();
            System.out.print("Enter option: ");
            string choice = myObj.nextLine();
            switch (choice) {
                case "0" -> end = true;
                case "1" -> CalcBMI();
                case "2" -> CalcArea();
                case "3" -> CalcCost();
                case "4" -> Calculator();
                case "5" -> NumberGuessingGame();
                default -> System.out.println("Enter a valid input");
            }
        }
        if (end) {
            System.out.println("Thank You for using the calculator");
        }
    }


    public static void Menu() {
        System.out.println("------------- M E N U -------------");
        System.out.println("-----------------------------------");
        System.out.println("1. BMI Calculator");
        System.out.println("2. Surface Area Calculator");
        System.out.println("3. Cost Calculator");
        System.out.println("4. Basic Calculator");
        System.out.println("5. Number Guessing Game");
        System.out.println("0. Exit");
    }


    public static void CalcBMI() {
        clearConsole();
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter height in meters(m): ");
        double height = Double.parseDouble(myObj.nextLine());
        System.out.print("Enter weight in Kilograms(Kg): ");
        double weight = Double.parseDouble(myObj.nextLine());
        double bmi = weight / (height * height);
        System.out.println("The BMI for a person with the weight of " + weight + "Kg and a height of " + height + "m is " + bmi);
        System.out.println("");
    }


    public static void SelectShape() {
        System.out.println("Calculate Area of Shapes");
        System.out.println("-----------------------------------");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");
        System.out.println("4. Trapezium");
        System.out.println("5. Rhombus");
        System.out.println("0. Exit");
    }


    public static void CalcCircle() {
        System.out.println("Calculating Area of Circle");
        System.out.println("-----------------------------------");
        System.out.println("");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        double r = Double.parseDouble(myObj.nextLine());
        System.out.println("Pi Values Available");
        System.out.println("-------------------");
        System.out.println("1. 22/7");
        System.out.println("2. 3.14");
        System.out.println("3. Calculator Pi Value");
        boolean Continue = true;
        while (Continue) {
            System.out.print("Select Pi Value: ");
            int piOption = Integer.parseInt(myObj.nextLine());
            switch (piOption) {
                case 1 -> {
                    double fracArea = (22 * r * r) / 7;
                    System.out.println("The Area of the Circle is " + fracArea);
                    System.out.println("");
                    Continue = false;
                }
                case 2 -> {
                    double simpArea = 3.14 * r * r;
                    System.out.println("The Area of the Circle is " + simpArea);
                    System.out.println("");
                    Continue = false;
                }
                case 3 -> {
                    double mathPiArea = Math.PI * r * r;
                    System.out.println("The Area of the Circle is " + mathPiArea);
                    System.out.println("");
                    Continue = false;
                }
                default -> {
                    System.out.println("Enter a valid input");
                    System.out.println("");
                }
            }
        }
    }


    public static void CalcSquare() {
        System.out.println("Calculating Area of Square");
        System.out.println("-----------------------------------");
        System.out.println("");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter length of one side: ");
        double length = Double.parseDouble(myObj.nextLine());
        double area = (length * length);
        System.out.println("The area of a square with the length of " + length + " is " + area);
        System.out.println("");
    }


    public static void CalcTriangle() {
        System.out.println("Calculating Area of Triangle");
        System.out.println("-----------------------------------");
        System.out.println("");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        double base = Double.parseDouble(myObj.nextLine());
        System.out.print("Enter height of triangle: ");
        double height = Double.parseDouble(myObj.nextLine());
        double area = (base * height) / 2;
        System.out.println("The area of a triangle with the base of " + base + " and height " + height + " is " + area);
        System.out.println("");
    }


    public static void CalcTrapezium() {
        System.out.println("Calculating Area of Trapezium");
        System.out.println("-----------------------------------");
        System.out.println("");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter first base of trapezium: ");
        double base1 = Double.parseDouble(myObj.nextLine());
        System.out.print("Enter opposite base of trapezium: ");
        double base2 = Double.parseDouble(myObj.nextLine());
        System.out.print("Enter height of trapezium: ");
        double height = Double.parseDouble(myObj.nextLine());
        double area = ((base1 + base2) * height) / 2;
        System.out.println("The area of a trapezium with the base of " + base1 + " and " + base2 + " with height " + height + " is " + area);
        System.out.println("");
    }


    public static void CalcRhombus() {
        System.out.println("Calculating Area of Rhombus");
        System.out.println("-----------------------------------");
        System.out.println("");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter height of rhombus: ");
        double height = Double.parseDouble(myObj.nextLine());
        System.out.print("Enter length of any side of rhombus: ");
        double length = Double.parseDouble(myObj.nextLine());
        double area = (length * height);
        System.out.println("The area of a rhombus with the length of one side as " + length + " and height " + height + " is " + area);
        System.out.println("");
    }


    public static void CalcArea() {
        clearConsole();
        Scanner myObj = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            SelectShape();
            System.out.print("Enter option: ");
            int choice = Integer.parseInt(myObj.nextLine());
            switch (choice) {
                case 0 -> {
                    System.out.println("");
                    exit = false;
                }
                case 1 -> CalcCircle();
                case 2 -> CalcSquare();
                case 3 -> CalcTriangle();
                case 4 -> CalcTrapezium();
                case 5 -> CalcRhombus();
                default -> {
                    System.out.println("Enter a valid input");
                    System.out.println("");
                }
            }
        }
    }


    public static void CalcCost() {
        clearConsole();
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter cost of product: ");
        double cost = Double.parseDouble(myObj.nextLine());
        System.out.print("Enter percentage discount: ");
        double percentageDiscount = Double.parseDouble(myObj.nextLine());
        double priceafterdiscount = (cost / 100) * (100 - percentageDiscount);
        System.out.println("The price of the product after a " + percentageDiscount + "% discount before GST is " + priceafterdiscount);
        System.out.println("");
        System.out.print("Would you like to calculate the cost with GST? (Y/N): ");
        String response = myObj.nextLine().toUpperCase(Locale.ROOT);
        if (response.equals("Y") | response.equals("YES")){
            System.out.print("Enter percentage of GST: ");
            double gst = Double.parseDouble(myObj.nextLine());
            double pricewithGST = ((priceafterdiscount / 100) * gst) + priceafterdiscount;
            System.out.println("The price of the product after GST is " + pricewithGST);
            System.out.println("");
        }
    }


    public static void CalculatorMenu() {
        System.out.println("Calculator Menu");
        System.out.println("-----------------------------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Multiplication Table");
        System.out.println("0. Exit");
    }


    public static void Add() {
        System.out.println("Addition");
        System.out.println("-----------------------------------");
        System.out.println("");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(myObj.nextLine());
        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(myObj.nextLine());
        double sum = (num1 + num2);
        System.out.println(num1 + "+" + num2 + "=" + sum);
        System.out.println("");
    }


    public static void Subtract() {
        System.out.println("Subtraction");
        System.out.println("-----------------------------------");
        System.out.println("");
        System.out.println("Enter the numbers in the following format when prompted");
        System.out.println("num1 - num2 = answer");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(myObj.nextLine());
        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(myObj.nextLine());
        double ans = (num1 - num2);
        System.out.println(num1 + "-" + num2 + "=" + ans);
        System.out.println("");
    }


    public static void Multiplication() {
        System.out.println("Multiplication");
        System.out.println("-----------------------------------");
        System.out.println("");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(myObj.nextLine());
        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(myObj.nextLine());
        double ans = (num1 * num2);
        System.out.println(num1 + "X" + num2 + "=" + ans);
        System.out.println("");
    }


    public static void Division() {
        System.out.println("Division");
        System.out.println("-----------------------------------");
        System.out.println("");
        System.out.println("Enter the numbers in the following format when prompted");
        System.out.println("num1 / num2 = answer");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(myObj.nextLine());
        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(myObj.nextLine());
        double ans = (num1 / num2);
        System.out.println(num1 + "/" + num2 + "=" + ans);
        System.out.println("");
    }


    public static void MultiplicationTable() {
        System.out.println("Multiplication Table");
        System.out.println("-----------------------------------");
        System.out.println("");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a Integer: ");
        int num = Integer.parseInt(myObj.nextLine());
        for (int i = 0; i < 16; i++) {
            int product = num * i;
            System.out.println(i + " X " + num + " = " + product);
        }
        System.out.println("");
    }


    public static void Calculator() {
        clearConsole();
        Scanner myObj = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            CalculatorMenu();
            System.out.print("Enter option: ");
            int choice = Integer.parseInt(myObj.nextLine());
            switch (choice) {
                case 0 -> exit = false;
                case 1 -> Add();
                case 2 -> Subtract();
                case 3 -> Multiplication();
                case 4 -> Division();
                case 5 -> MultiplicationTable();
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
                System.out.println("Guess a number: ");
                guess = Integer.parseInt(myObj.nextLine());
                if (guess > 100) {
                    System.out.println("The integer is in the range of 0 and 100");
                }
                else if (guess == int_random) {
                    System.out.println("Congrats! you got it. The number was " + int_random);
                    System.out.println("The number was guessed in " + guessnum + " of tries.");
                    break;
                }
                else {
                    HigherLowerCheck(int_random, guess);
                    System.out.println("Guess Again!");
                    guessnum += 1;
                    System.out.println("");
                    System.out.println("Guess a number: ");
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
                    break;
                }
                else {
                    HigherLowerCheck(int_random, guess);
                    System.out.println("Guess Again!");
                    guessnum += 1;
                    System.out.println("");
                    System.out.println("Guess a number: ");
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
                System.out.println("Guess a number: ");
                guess = Integer.parseInt(myObj.nextLine());
                if (guess > 100) {
                    System.out.println("The integer is in the range of 0 and 100");
                }
                else if (guess == int_random) {
                    System.out.println("Congrats! you got it. The number was " + int_random);
                    System.out.println("The number was guessed in " + guessnum + " of tries.");
                    guessnum = 13;
                }
                else {
                    HigherLowerCheck(int_random, guess);
                    System.out.println("Guess Again!");
                    guessnum += 1;
                    System.out.println("");
                    System.out.println("Guess a number: ");
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
                    guessnum = 13;
                }
                else {
                    HigherLowerCheck(int_random, guess);
                    System.out.println("Guess Again!");
                    guessnum += 1;
                    System.out.println("");
                    System.out.println("Guess a number: ");
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
                System.out.println("Guess a number: ");
                guess = Integer.parseInt(myObj.nextLine());
                if (guess > 100) {
                    System.out.println("The integer is in the range of 0 and 100");
                }
                else if (guess == int_random) {
                    System.out.println("Congrats! you got it. The number was " + int_random);
                    System.out.println("The number was guessed in " + guessnum + " of tries.");
                    guessnum = 13;
                }
                else {
                    HigherLowerCheck(int_random, guess);
                    System.out.println("Guess Again!");
                    guessnum += 1;
                    System.out.println("");
                    System.out.println("Guess a number: ");
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
                    guessnum = 13;
                }
                else {
                    HigherLowerCheck(int_random, guess);
                    System.out.println("Guess Again!");
                    guessnum += 1;
                    System.out.println("");
                    System.out.println("Guess a number: ");
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


    public static void NumberGuessingGame() {
        clearConsole();
        Scanner myObj = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            NumberGuessingGameMenu();
            System.out.print("Enter option: ");
            int choice = Integer.parseInt(myObj.nextLine());
            switch (choice) {
                case 0 -> exit = false;
                case 1 -> EasyMode();
                case 2 -> HardMode();
                case 3 -> ImpossibleMode();
                default -> System.out.println("Enter a valid input");
            }
        }
    }
}
