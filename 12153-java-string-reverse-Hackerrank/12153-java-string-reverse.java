import java.io.*; 

public class Solution {

public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    /* Enter your code here. Print output to STDOUT. */

StringBuilder sb = new StringBuilder(A);
sb.reverse();
if(A.equals(sb.toString())){
    System.out.println("Yes");
}
else{
    System.out.println("No");
}
    sc.close();

}
import java.util.*;
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna