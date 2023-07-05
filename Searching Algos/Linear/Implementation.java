// Works on non sorted Arrays too.
// Time  ->  O(N)  [ best case O(1) ]      |     Space  ->  O(1)

public class Main {
    static int linearSearch(int[] array, int target) {
        
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == target) return i; // matches every element of array to target one by one and if equal the index is returned.
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {11, 32, 83, 45, 15, 56 , 37, 28, 99, 17, 15, 49};
        int target = 28;

        System.out.println("Found at index " + linearSearch(array , target));
    }
}
