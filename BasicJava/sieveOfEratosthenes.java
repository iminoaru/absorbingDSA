// Best algo to find the primes smaller than a given number n.
//false means prime
//true means composite

public class sieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 100000;
        boolean[] primes = new boolean[n+1]; //all elements are false by default
        sieve(n , primes);
    }

    static void sieve(int n , boolean[] primes){
        for(int i = 2 ; i <= ((int)Math.sqrt(n)) ; i++){
            if(primes[i] == false){
                for(int j = i*2 ; j <= n ; j = j+i){ //j+i iterates at the multiple of i(i is prime)
                    primes[j] = true;
                }
            }
        }

        for(int i = 2 ; i <+ n ; i++){
            if(primes[i] == false){
                System.out.print(i + " "); //printing i and not primes[i] because we want numbers .
            }
        }

    }
}
// auxilary space is O(n)
// time complexity is O(n * log(logn)) 
//O(log(logn)) because of harmonic series
