package LeetcodeQuestions.EasyQuestion;

// problem --> Find Smallest letter Greater than target.
// NOTE --> letter is wrap around
public class problemNo744 {
    public static void main(String[] args) {

        char []arr = {'a', 'c', 'j'};
        // char target = 'b';
        // char target = 'j';
        char target = 'z';

        char res = nextGreatestLetter(arr, target);
        System.out.println(res);       
    
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (letters[mid] > target) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }

}


    
