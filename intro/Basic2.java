package intro;
class calculator{
@Deprecated
public class Basic2 {
    void oldmethod () {
        System.out.println("old method not recommended ");
    }
    void newmethood(){
        System.out.println("new method use this method ");
    }
}

public class Mydepreceated {
    public static void main(String args[]) {
        Basic2 b = new Basic2();
        b.newmethood();
        b.oldmethod();
    }
