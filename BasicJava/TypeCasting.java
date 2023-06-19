import java.util.Scanner ;

public class TypeCasting {
   
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //basic line to just introduce input function
        System.out.print("Enter the two numbers: ");
        float num_1 = input.nextFloat(); // input number 1
        float num_2 = input.nextFloat(); // input number 2
        // the int numbers will be converted in float because java can take small datatype value in
        // larger datatype value like int --> float but not vice versa.
        float Sum = num_1 + num_2 ;
        System.out.println("The sum is: " + Sum);  
    
        // syntax for type casting
        int num = (int)(69.240f); //the float 69.420 converts into int
        System.out.println(num);

        //automatic type promotion in expressions
        byte a = 127; // max byte size is 128-1 = 127
        System.out.println(a);
        int b = 255;
        System.out.println(b);
        byte c = (byte)(b);
        System.out.println(c);//returns 256 - b
    }   
}
// if you have multiple data types in arithmatic operations then all the datatypes will be converted
// into the largest datatype in that operation.
    

