package customAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  // this marks the annotation available at run time 
@Target({ElementType.METHOD, ElementType.FIELD})

public @interface Info {
    String author();
    String description() default "no description provided ";

}
//@Retention(---)--> this will be needed for the java reflection API to work
// author() ->  it is a required parameter 
// description ()-> optimal parameter



// we have customl;y defined annotations in info.java 
//  the annotataion  have two  author and description 
