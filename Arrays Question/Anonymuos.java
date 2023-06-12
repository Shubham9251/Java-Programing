package Arrays;

class Demo {

    public void display (int a[]) {
        int result = 0;
       for (int n : a) {

        result +=n;
        }
        System.out.println(result);
    }
}
public class Anonymuos {
    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 4, 5};
        Demo d = new Demo();
        // d.display(arr);
        d.display(new int[]{1, 2, 3, 4, 5});
    }
}
