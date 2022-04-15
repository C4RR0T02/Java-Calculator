import java.util.*;

public class discountcalc {

    public static void main(String[] args) {
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

}
