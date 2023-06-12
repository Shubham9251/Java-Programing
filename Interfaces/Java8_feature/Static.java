package Interfaces.Java8_feature;

interface stt {
    static void logo(){
        System.out.println("i am default!");
    }

    static void mono(){
        System.out.println("god is great!!");
    }
}

class last implements dft {

    // we can override Static method also.    
    public void mono(){
        System.out.println(" God is every where!");
    }
}

public class Static {
    public static void main(String[] args) {
        dft d = new last();
        d.logo();
        d.mono();
    }
}
