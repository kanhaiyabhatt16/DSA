import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        String a=sc.nextLine();
        String b=sc.nextLine();
        
        int c = a.length()+b.length();
        System.out.println(c);
        
        if (a.compareTo(b) > 0){
           System.out.println("Yes");    
        }
        
        else{
            System.out.println("No");
        }
        String d= a.substring(0, 1).toUpperCase() + a.substring(1);
        String e= b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(d+" "+e);
        }
        
    
    
    
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna