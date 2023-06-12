package Arrays;

public class missingNumber {
    public static void main(String[] args) {
        
        int [] arr = {1, 2, 3, 5, 7, 8, 9};

        for (int i = 0; i < arr.length-1; i++) {
            int a = ++arr[i];
            
            if (a != arr[i+1]) {
                System.out.println(a);
            }
        }

        //or
        // int n = arr.length;
        // int total = 1;
        // for (int i = 2; i < (n + 1); i++) {
        //     total += i;
        //     total -= arr[i - 2];
        // }
        // System.out.println(total);


    }
}
