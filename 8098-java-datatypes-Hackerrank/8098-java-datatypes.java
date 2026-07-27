import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long d = sc.nextLong(); // Read as long first
                System.out.println(d + " can be fitted in:");

                if (d == (byte) d)  System.out.println("* byte");
                if (d == (short) d) System.out.println("* short");
                if (d == (int) d)   System.out.println("* int");
                if (d == (long) d)  System.out.println("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna