import java.util.*;

public class areacalc {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            SelectShape();
            System.out.print("Enter option: ");
            int choice = Integer.parseInt(myObj.nextLine());
            System.out.println("");
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
            System.out.println("");
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

}
