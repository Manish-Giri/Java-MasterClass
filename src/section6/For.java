package section6;

/**
 * Created by manishgiri on 5/8/17.
 */
public class For {

    private static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        else {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    private static void forTest() {

        int count = 0;
        for(int i = 1; i < 50; i++) {
            if(count >= 30) {
                break;
            }
            if(isPrime(i)) {
                System.out.println(i + " is a prime number.");
                count++;
            }

        }
        System.out.println("Number of primes = " + count);
    }

    public static void main(String[] args) {
        forTest();
    }
}
