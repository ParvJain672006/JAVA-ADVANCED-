package customAnnotations;

import java.lang.reflect.Field;

public class ANNotationreader {
    public static void main ( String args []){
        try{
            //get the class 
            Class<?> cls= Myclass.class; // obtain my class at runtime  // iterate throuhg all the fields // iterate througgh all thee metod // error handling 
            // read field annotations 
            for (Field field : cls.getDeclaredFields()) {
                if (field.isAnnotationPresent(Info.class)) {
                    Info info = field.getAnnotation(Info.class);
                    System.out.println("Field: " + field.getName());
                    System.out.println("Author: " + info.author());
                    System.out.println("Description: " + info.description());
                }
            }
        } 
        catch (Exception e) {
            // read method annotations (exact copy of field logic, but for methods)
            for (java.lang.reflect.Method method : Myclass.class.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Info.class)) {
                    Info info = method.getAnnotation(Info.class);
                    System.out.println("Method: " + method.getName());
                    System.out.println("Author: " + info.author());
                    System.out.println("Description: " + info.description());
                }
            }
        }
    
}
    
}
