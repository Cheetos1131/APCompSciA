public class Primes {
    private int lowerLimit;
    private int upperLimit;
    private int count = 0;

    public Primes(int lowerLimit, int upperLimit) {
        //Creates the Primes obj with an upper and lower limit
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public void primeLoop() {
        //Loops through from the low to high and checks whether the given number is prime
        //If so print it out
        for(int i = lowerLimit; i <= upperLimit; i++) {
            //Skip 0 and 1 as they are not prime;
            if(i == 0 || i == 1) {
                continue;
            }
            if(isPrime(i)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Total number of prime numbers in the range: " + count);
    }

    //Algorithmn to check if number is prime
    public boolean isPrime(int n) {
        for(int j = 2; j <= n / j; ++j) {
            if(n  % j == 0) {
                return false;
            }
        }
        return true;
    }
}