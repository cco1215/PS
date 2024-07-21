import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean isPrime = true;

        if(n == 1) {
            n += 1;
        }
        else if (n == 0) {
            n += 2;
        }
        for (int i = n; i <= m; i++) {
            for (int j = 2; j*j <= i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(i);
            }
            isPrime = true;
        }
    }
}