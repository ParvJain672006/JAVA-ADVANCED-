class Animal{
    void speak (){
        System.out.println("animal speaks ");
    }
}

class Dog extends Animal {
    @Override
    void speak (){
        System.out.println(" dog barks ");
    }
}

public class BASic{
    public static void main ( String args []){
        Animal a1 = new Dog ();
        a1.speak();
        
    }
}