package LeetcodeQuestions.MediunQuestion;

// find peak in mountain array.
public class problemNo162 {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 5, 3, 2};
        // int []arr = {1,2,1,3,5,6,4};
        // int []arr = {0, 2, 1, 0};
        // int []arr = {1,2,3,1};

        int index = mountainArr(arr);
        System.out.println(index);
    }
    static int mountainArr (int []arr) {
        int start = 0;
        int end = arr.length-1;

        // i break this loop on (start == end) because if this condition is occurs then 
        //one element is remaning in the arr and that is large or peek of the arr.
        while (start < end) {
            int mid = start + (end-start)/2;

            if (arr[mid] > arr[mid+1]) {
                // yor are in decrasing part of arr...
                // this may be the ans But look at left
                //this is why end != mid-1
                end = mid;
            }
            if (arr[mid] < arr[mid+1]) {
                // you are in the increasing part of arr..
                start = mid+1;
            }
        }
        return start; // or return end Because both are same index.
    }
}
