package Enumeration;

public class Enum2 {
    public static void main ( String args  []){
        color c1 = color.RED;
        System.out.println("red enum name ");
//System.out.println(" RED enum value :" + c1.getValue());

        for ( color allcolors : color.values() ){
            System.out.println("enum value : " + allcolors. getValue());
        }
    }
    
}
