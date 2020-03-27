import java.util.*;

public class Euler3 {
    private static SortedSet<Long> primes = new TreeSet<>();
    /**
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * <p>
     * What is the largest prime factor of the number 600851475143 ?
     */
    public static void main(String[] args) {
        long prime_to_check = 600851475143l;

        // Don't understand this one well.
        // We don't need to check primes greater than the square root, a number will not divide without a remainder
        // after it's square root.
        //https://math.stackexchange.com/questions/1039519/finding-prime-factors-by-taking-the-square-root

        // Anything greater than n/2 won't divide the number without a remainder.
        for(long i=2;i<=Math.ceil(prime_to_check/2);i++){
            if(isPrime(i))
                primes.add(i);

        }
        System.out.println("Primes generated");
        System.out.println(getPrimeFactors(prime_to_check));
    }

    public static List<Long> getPrimeFactors(long n) {
        List<Long> primes = new ArrayList<>();
        for (long i = 2; i <= Math.ceil(n/2); i++) {
            if (isInPrimeList(i) && n % i == 0) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static boolean isInPrimeList(long n){
        return primes.contains(n);
    }

    public static boolean isPrime(long n) {
        for (long i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
