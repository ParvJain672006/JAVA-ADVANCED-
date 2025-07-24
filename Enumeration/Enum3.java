package Enumeration;


    enum day {
        MONDAY , TUESDAY , WEDNESDAY , THRUSDAY , FRIDAY , SATURDAY 
    }
    public class Enum3 {
        public static void main ( String args []){
            day TD = day.MONDAY;
            switch((TD)){
                case MONDAY :
                System.out.println("start of thh weekend ");
                break;

                case FRIDAY :
                System.out.println(" end of the week ");
                break;

                case  SATURDAY:
                System.out.println("bro party ");
                break ;

                default:
                System.out.println(" mid weekend");
                
            }

        }
}
