import java.util.Scanner;

public class Fun {
    public static void main(String[] args){
       String name = "Sarthak";
       System.out.println(name);
       Sum(name);
       System.out.println(name);
       System.out.println(name);
    }

    static String Sum(String name){
        // strings are immutable , so gaud won't be replaced
        name = "Gaud";
        
        return name;
    }   
}
