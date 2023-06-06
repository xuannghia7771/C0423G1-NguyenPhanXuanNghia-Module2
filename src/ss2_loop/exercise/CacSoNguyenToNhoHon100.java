package ss2_loop.exercise;

public class CacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int n = 2;
        while (n <= 100) {
            if (isPrime(n)) {
                System.out.println(n);
            }
            n++;
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
