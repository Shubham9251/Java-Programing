package Interfaces.Java8_feature;

/* Franctional interface is used only where any interface have single abstract method.
 * franctional interface is also called single abstract method interaface.
 */

interface car {
    void driving ();
}

class run implements car {
    public void driving(){
        System.out.println("car is driving.....");
    }
}
public class Fractional {
    public static void main(String[] args) {
        car c = new run();
        c.driving();
    }
}
