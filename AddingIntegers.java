/*This program adds integers from the user could be improved. In some situations it would not be correct to say that the sum of integers 
 * is zero when the user, in fact, entered no integers. 
 * Written by: Janelie S. Blanco BSCS 1A */
import java.util.Scanner;

public class AddingIntegers {
    public static void main(String[] args){
        //declaration of string and int variables
        String suffix;
        int value, sum = 0, count = 0;
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter first integer: "); //prompts the user 
        value = scan.nextInt();

        if (value == 0)
            System.out.println("No integers were entered. Good bye!"); //invalid msg
        else{
            while (value != 0){
                sum += value; 
                count++;

                if (count + 1 == 2)
                    suffix = "nd"; //2nd
                else if (count + 1 == 3)
                    suffix = "rd"; //3rd
                else 
                    suffix = "th"; //4th and so on
                
                System.out.print("Enter the " + (count + 1) + suffix + " integer (enter 0 to quit): "); //looping until the user inputs 0
                value = scan.nextInt();
            }
            System.out.println("Sum of the integers: " + sum); //output
            System.out.println("Thank you. Goodbye!");
        }
        scan.close();
    }
}
