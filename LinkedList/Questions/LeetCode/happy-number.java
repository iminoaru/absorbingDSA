https://leetcode.com/problems/happy-number/submissions/979881514/


// It doesn't use exactly the linkedlist data structure but it uses the 
// Floyd cycle detection algo and it is working like, slow keeps finding
// the square of each squareAddition and fast find it of every second
// element, so if the fast and slow ever meets that means that there is 
// a cycle since slow can never reach fast in a non cyclic structure.
// now we compare the slow to 1 as it was the given condition for the 
// magic number. 
// n is not passed in the 'do' because the change in n due to slow will 
// affect the n in fast so thats why we create 2 seperate variables for then
// so they can run independently (i was confused in this point at first)
// now finally when that do while loop terminates, then if the slow is 1
// then it gives true because if slow == 1 this means that the cycle
// was not present, else the cycle was present and will return false.
// one more doubt was that if there is no cycle then the fast wont meet  
// slow and will result in infinite loop but no as the slow pointer becomes 
// 1 this means no cycle was present and the findingSquare will keep returning 
// 1 1 1 so the fast will be set to 1 and the slow will catch up to it and 
// thus will end the loop.


class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do{
            slow = findingSquare(slow);
            fast = findingSquare(findingSquare(fast));
        }
        while(slow != fast);

        if(slow == 1) return true;
        return false;
    
    }
        int findingSquare(int num){
            int rem = 0;
            int squareSum = 0;
            
            while(num > 0){
                rem = num % 10;
                squareSum += rem * rem;
                num = num / 10;
            }
            return squareSum;
        }
}
