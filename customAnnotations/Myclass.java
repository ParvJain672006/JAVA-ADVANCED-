package customAnnotations;

public class Myclass {
    @Info(author = "laksh " , description  = "this is a name  variable ")
    String name ;
    @Info(author = " case")
    public void SayHello(){
System.out.println("hello world ");
    }
    
}


// class with annotation usage is MY.java
//a method  say hello  annotated with @ info specifying only author and no description  provided   so it will take the default value 