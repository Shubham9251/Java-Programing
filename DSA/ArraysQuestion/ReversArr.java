package DSA.ArraysQuestion;

public class ReversArr {
    public static void main(String[] args) {
        
        int [] arr = {1, 2, 3, 2, 4};

        // for (int i = 1; i <= arr.length; i++) {
        //     System.out.print(arr[arr.length-i]);
            
        // }
        
        // for (int i = arr.length-1; i >= 0; i--) {
        //     System.out.println(arr[i]);
        // }

        for (int i = 0; i < arr.length/2; i++) {
            int temp = 0;
            temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // int[] arr1 = new int[5];

        // for (int i = 1; i <= arr.length; i++) {
        //     arr1[i-1] = arr[arr.length-i];
        //     System.out.println(arr1[i-1]);
        // }
    }
}
