/*This program is a mail order company that charges $3.00 for handling, free shipping for orders 10 pounds or less, plus $0.25 for each pound over 10.
 * It repeatedly asks the user for the weight of an order, then writes out the shipping charge. The program stops when a weight of zero or less is entered.
 * Written by: Janelie S. Blanco BSCS 1A */
import java.text.DecimalFormat;
import java.util.Scanner; 

public class ShippingCostCalculator {
    public static void main(String[] args){
        //declaration of constant and double variables
        double orderWeight = 0, totalCost;
        final double HANDLING_CHARGE = 3.00;
        final double FREESHIPPING_WEIGHT = 10;
        final double EXTRA_PER_POUND = 0.25;
        Scanner scan = new Scanner (System.in);

        while (orderWeight >= 0){  
            System.out.print("Input Weight of Order: "); //looping ques of weight
            orderWeight = scan.nextDouble();

            if (orderWeight <= 0){
                System.out.println("Thank you for your order. Goodbye!");
                break;
            }

            if (orderWeight <= FREESHIPPING_WEIGHT)
                totalCost = HANDLING_CHARGE;
            else
                totalCost = HANDLING_CHARGE+ ((orderWeight - FREESHIPPING_WEIGHT) * EXTRA_PER_POUND);
            
            //output
            DecimalFormat numform = new DecimalFormat("0.00");
            System.out.println("Shipping Cost: $" + numform.format(totalCost));
        }
        scan.close();
    }
}
