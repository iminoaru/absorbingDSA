import java.util.Arrays;

public class Varargs {
    public static void main(String[] args){
        // ...s allows us to put multiple arguments of same type.
        // variable length arguments should be at the last.
        function(2 , 3 , 'c' , 'a' , 't');

    }
    static void function(int a , int b ,char ...s){
        System.out.println(Arrays.toString(s));
    }
    
}
