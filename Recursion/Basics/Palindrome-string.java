public class Main{
    
    static boolean isPalindrome(int i , int size , String word){
        if(i >= size/2) return true;
        if(word.charAt(i) != word.charAt(size-i-1)) return false;
        
        return isPalindrome(i+1 , size , word);
    }
    
	public static void main(String[] args){
	    String word = "lolxlol";
	    int size = word.length();
	    
		System.out.println(isPalindrome(0 , size , word));
	}
}
