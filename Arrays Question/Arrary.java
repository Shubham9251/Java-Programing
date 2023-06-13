package ArraysQuestion;



/* Arrary is nathing but an object container that contain similar type of data in block.
-In java we can initilized an arrary with "new" keyword like an object.
-In java arrary is store in "heap memory area".
-In java arrary is created in dynamicaly. 
-There are main three type of arrary in java :
1. 1-d Arrary
2. 2-d arrary
3. jagged arrary*/

public class Arrary {
    public static void main(String[] args) {  

    /* 1-d arrary  */

        // int arr[] = {1, 5, 4, 8, 6};
        //int []arr = {1, 5, 4, 8, 6};
        // String []arr = {"shubham", "mohit", "vedansh", "rohan"};

        /*  int []arr = new int[5];
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = 1;
            arr[3] = 1;
            arr[4] = 1;  */

        /*  int []arr =new int[5];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt(); 
            }
            sc.close();  */

        //  for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        //    }
        
            // for (int i : arr) {
                // System.out.print(i);
            // }
   
            // for (String s : arr) {
                // System.out.print(s + " ");            
            // }

    /* 2-d arrary */        

        /*  int [][]arr = {
                {1, 5, 4, 8, 6},
                {6, 5, 4, 8, 1}
            }; */

        //   int [][]arr = new int[2][5];
        //     Scanner sc = new Scanner(System.in);
        //     for (int i = 0; i < 2; i++) {
        //         for (int j = 0; j < 5; j++) {
        //             arr[i][j] = sc.nextInt();
        //         }
        //         System.out.println();
        //     }
        //     sc.close();  
    

        /*  for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            } */
            
            // for (int i[] : arr) {
            //     for (int j : i) {
            //         System.out.print(j + " ");
            //     }
            //     System.out.println();
            // }
    
    /* jagged arrary */
            
          int [][]arr = {
                    {1, 2, 3, 4},
                    {2, 4},
                    {5, 4, 3}
            };             
            
            for (int i[] : arr) {
                for (int j : i) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }

    }
}
