package array;
import java.util.*;
public class binary_to_decimal {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Binary number");
        String str = sc.nextLine();
        System.out.println("Decimal is ");
        System.out.println( Integer.parseInt(str,2));
       // System.out.println("Decimal number is");
      //  System.out.println(str);
    }
}
