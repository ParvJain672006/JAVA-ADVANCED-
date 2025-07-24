package JCFjavaCOLLECTIONframework;

import java.util.HashMap;
import java.util.*;

public class HASHMAPdemo {
    public static void main ( String args []){
        

        // create a hashmap to map integer ids ( integer  ) ---> names(string )

        Map<Integer, String> studentsMap =  new HashMap<>();

        // add the key value paisr 

        studentsMap.put(121,"alice");
        studentsMap.put(1022,"alieece");
        studentsMap.put(10222,"alic222eee");
        studentsMap.put(121,"alie");

        System.out.println("enhanced for loop ");
        
        for (Integer studentId : studentsMap.keySet()) {
            System.out.println(studentId);
        }

        // print the map 
        System.out.println("student.map :" + studentsMap);

        // get value by key 
        System.out.println(" student with id  102 : " + studentsMap.get(1022));
        System.out.println(("size " + studentsMap.size()));




    }
    
}
