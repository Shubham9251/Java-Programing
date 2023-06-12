package Interfaces.Java8_feature;

/* java8 feature are: 
        1. Default method interface.
        2. Static method interface.
        3. functional method
*/
/*if we require any method implementation common to every implementation class
    with fixed implementation then we have to implement that method in the interface as default method and static method */

interface dft{
    
    default void logo(){
        System.out.println("i am default!");
    }

    default void mono(){
        System.out.println("god is great!!");
    }
}

class last implements dft {

    // we can override default method also.    
    public void mono(){
        System.out.println(" God is every where!");
    }
}

public class Default {
    public static void main(String[] args) {
        dft d = new last();
        d.logo();
        d.mono();
    }
}
