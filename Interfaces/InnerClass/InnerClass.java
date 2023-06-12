package Interfaces.InnerClass;

/* Inner calss -->  can be ststic , final , Anonymous */

class student {

    public void showName() {
        System.out.println("hello i am shubham sharma");
    }

    class id {
        void showid(){
            System.out.println("id is : 456216");
        }
    }
    static class id1 {
        void showid1(){
            System.out.println("id1 is : 456216");
        }
    }
    

}

public class InnerClass {
    public static void main(String[] args) {
        student s = new student();
        s.showName();
        
        student.id i = s.new id();
        i.showid();

        student.id1 i1 = new student.id1();
        i1.showid1();
    }
}
