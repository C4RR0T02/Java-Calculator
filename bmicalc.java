import java.util.*;

public class bmicalc {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter height in meters(m): ");
        double height = Double.parseDouble(myObj.nextLine());
        System.out.print("Enter weight in Kilograms(Kg): ");
        double weight = Double.parseDouble(myObj.nextLine());
        double bmi = weight / (height * height);
        System.out.println("The BMI for a person with the weight of " + weight + "Kg and a height of " + height + "m is " + bmi);
        System.out.println("");
        
    }

}
