public class Euler7 {
    /**
     * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
     *
     * What is the 10 001st prime number?
     */
    public static void main(String[] args) {
        int primeCount = 0;
        long l=1;
        while(primeCount <=10001){
            if (isPrime(l)){
                primeCount++;
            }
            l++;
        }

        System.out.println(--l);
    }

    public static boolean isPrime(long n) {
        for (long i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
