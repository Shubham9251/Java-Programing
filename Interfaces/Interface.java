package Interfaces;

/*  interface is similar to abstract class but it does not have any normal mathed like abstract class.
    interface is used to achive 100% abstraction and loose copuling.
    feature fo interface are :   
    -> we not create object of interface.
    -> constructor is not used in interface.
    -> inheritance concept is used only between interfaces. 
    -> interface is implements in other class.
 */

interface A {
    int a = 5;      // this variable by default is "public static final" .
    void show() ;   // this method by default is  "public and abstrac".
}
interface B {
    void demo();
}

class Z implements A, B {
    public void show () {
        System.out.println("in show");
    }

    public void demo() {
        System.out.println(a);
        System.out.println(" in demo");
    }
}

public class Interface {
    public static void main(String[] args) {
        
        Z z = new Z();
        z.show();
        z.demo();
        
        // A z = new Z();
        // B z1 = new Z();
        // z.show();
        // z1.demo();

        // new Z().show();  // we can also call like this.
        // new Z().demo();
    }
}
