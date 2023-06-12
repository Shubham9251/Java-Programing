package Interfaces;

// Naming Conflicts: 
// there are two interface haveing two variable with same name so we can resolved this using interface naming.


interface add{
    public static final int a = 5, b = 4;       

    public abstract void adding();

    public abstract void multi();       // naming conflicts in methods!
}

interface sub{
    public static final int a = 10, b = 4;
    
    public abstract void subtract();

    public abstract void multi();
}

class result implements add, sub{
    public void adding () {
        System.out.println(add.a+add.b);
    }

    public void subtract(){
        System.out.println(sub.a-sub.b);
    }

    public void multi() {                   // so we can single implementation is enougf for both interface's methods
        System.out.println(add.a*add.b);
        System.out.println(sub.a*sub.b);
    }
}

public class Interface3 {
    public static void main(String[] args) {
        
        result r = new result();
        r.adding();
        r.subtract();
        r.multi();

        System.out.println("----------------");        
        Dog d = new Dog();
        d.show();
    
    }
}
