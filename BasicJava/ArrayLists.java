import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayLists {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i != 8 ; i++){
            list.add(in.nextInt());
            }
            System.out.println(list);
        }
    }

