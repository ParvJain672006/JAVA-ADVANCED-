package intro;

@FunctionalInterface
interface Greeting {
    void SayHello();
}
    public class BAsicthreee{
        public static void main ( String args []){
            Greeting mygreet = ()-> System.out.println("HEllo form lambda ");
            mygreet.SayHello();
        }
    }

    

