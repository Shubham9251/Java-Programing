package Interfaces;

interface Animal {
    void show();
}

class Dog implements Animal {
    public void show() {
        System.out.println(" Dog!!");
    }
}
class cat implements Animal {
    public void show() {
        System.out.println(" cat!!");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        
        // Animal a = new Dog();
        // a.show();
        // Animal a1 = new cat();
        // a1.show();

        new Dog().show();
        new cat().show();
    }
}
