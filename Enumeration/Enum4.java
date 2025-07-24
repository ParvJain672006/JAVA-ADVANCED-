package Enumeration;

enum SHIP{
    PLACE , DELIVERED , SHIP , CANCLE ;

}

public class Enum4 {
    public static void main ( String agrs []){
        SHIP s = SHIP.SHIP;
        switch((s)){
            case PLACE :
            System.out.println("ordr placed  ");
            break;

            case SHIP :
            System.out.println("  ORDER shipPED");
            break;

            case  DELIVERED:
            System.out.println("ORDER DElIVERED ");
            break ;

            default:
            System.out.println(" do YOU want to cancele your order ");



    }
    
}
};

