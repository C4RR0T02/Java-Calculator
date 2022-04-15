import java.util.*;

public class calculator {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            CalculatorMenu();
            System.out.print("Enter option: ");
            String choice = myObj.nextLine();
            switch (choice) {
                case "0" -> exit = false;
                case "1" -> Add();
                case "2" -> Subtract();
                case "3" -> Multiplication();
                case "4" -> Division();
                case "5" -> MultiplicationTable();
                default -> System.out.println("Enter a valid input");
            }
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
        System.out.println("");
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
        System.out.println("");
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
        System.out.println("");
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
        System.out.println("");
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
        System.out.println("");
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

}
