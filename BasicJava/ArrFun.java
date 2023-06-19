import java.util.Arrays;


public class ArrFun {
    public static void main(String[] args) {
       
        int[] arr = {2,5,3,1,6,8,6,5};

        System.out.println(Arrays.toString(arr));
        changes(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changes(int[] arr){
        arr[1] = 69;
    }
}

