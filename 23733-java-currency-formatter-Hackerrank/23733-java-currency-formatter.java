import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        NumberFormat usF = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaF = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaF = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceF = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        DecimalFormatSymbols indiaSymbols = ((DecimalFormat) indiaF).getDecimalFormatSymbols();
        indiaSymbols.setCurrencySymbol("Rs.");
        ((DecimalFormat) indiaF).setDecimalFormatSymbols(indiaSymbols);


        String u = usF.format(payment);
        String i = indiaF.format(payment);
        String c = chinaF.format(payment);
        String f = franceF.format(payment);

        System.out.println("US: " + u);
        System.out.println("India: " + i);
        System.out.println("China: " + c);
        System.out.println("France: " + f);
    }
}




// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna