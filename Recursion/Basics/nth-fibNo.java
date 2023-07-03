
public class Main{
    
    static int fib(int nth){
        if(nth == 1) return 1;
        if(nth == 0) return 0;
        return fib(nth - 1) + fib(nth - 2);
    }
    
	public static void main(String[] args){
	    int nth = 15;
		System.out.println(fib(nth));
	}
}
// Time complixity is O(2^n) exponential time because each fn call calls 2 more fns intil nth reaches 0 or 1 
