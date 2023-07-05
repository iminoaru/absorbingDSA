// Only works on sorted Arrays.
// Time  ->  O(logN)     |     Space  ->  O(1)

public class Main {
    static int binarySearch(int[] array, int target) {
        
        int start = 0;
        int end = array.length - 1;

        while (start <= end) { // start cant be greater than mid or else the whole progress will be reversed
        
            int mid = start + ((end - start) / 2); // same as start + end / 2 but better optimized

            if (array[mid] == target) return mid; //Found the target
            
            else if (array[mid] > target) end = mid - 1; // target must be before mid (left side)
             
            else start = mid + 1; // target must be after mid (right side)
        }

        return -1; // target not found
    }

  
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6 , 7, 8, 9, 11, 15, 49};
        int target = 9;

        System.out.println("Found at index " + binarySearch(array , target));
    }
}
