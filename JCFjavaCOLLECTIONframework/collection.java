package JCFjavaCOLLECTIONframework;

import java.util.*;

public class collection {
    public static void main ( String args[]){
        //create a hashset to store integers ( studenties)

    Set<Integer> Students = new TreeSet<>();
        
        // old element 
        Students.add(10);
        Students.add(101);
        Students.add(1011);
        Students.add(10111);

        // print the set 

        System.out.println("student IOS :" + Students);
        // print all students using enhanced for loop
        System.out.println("using enhanced for loop");
        for (Integer student : Students) {
            System.out.println(student);
        }
        // check the size 

        System.out.println("size of set " + Students.size());
        System.out.println("student contains 101: " + Students.contains(101));
        System.out.println("remove " + Students.remove(101));
        System.out.println(Students);
    }
}
