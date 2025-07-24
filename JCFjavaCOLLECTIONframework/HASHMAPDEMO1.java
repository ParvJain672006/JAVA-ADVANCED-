package JCFjavaCOLLECTIONframework;

import java.util.HashMap;
import java.util.*;


public class HASHMAPDEMO1 {
    public static void main (String args[]){
        Map<String , Integer> HELO = new HashMap<>();

        HELO.put("parv", 101);
        HELO.put("laksash" , 102);
        HELO.put("piyush" , 102);
        HELO.put("PAGAL", 104);

        System.out.println(" this is to print  all HELO MEMBERS " + HELO.size());
        System.out.println("this is to remove Helo members if yoou want " + HELO.remove("PAGAL"));
        System.out.println("this is to print all HELO MEMBERS NAME " + HELO );

        for( Integer hi : HELO.values()){
            System.out.println(hi);

            System.out.println();
        }
        System.out.println(" i hope you will understand");
        
        

    }
    
}
