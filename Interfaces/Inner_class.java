package Interfaces;

class tubeLight {

    class turnOn {      // inner class : we can not create an object of inner class directly.
        void On () {
            System.out.println(" turnOn!! ");
        }
    }

    
}

public class Inner_class {
    public static void main(String[] args) {
        
        tubeLight l = new tubeLight();

        // tubeLight.turnOn on = l.new turnOn();
        // on.On();
        
        l.new turnOn().On();

        // new tubeLight().new turnOn().On();

        

    }
}