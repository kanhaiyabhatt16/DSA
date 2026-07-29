String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int n = s.length();
    String arr[] = new String[n-k+1];

    for(int i = 0;i<n-k+1;i++){
        String subs = s.substring(i,i+k);
        int j = i-1;

        while(j>=0 && arr[j].compareTo(subs)>0){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = subs;
    }

    smallest = arr[0];
    largest = arr[n-k];

     
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna