import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int p = 0;

        if (a == b && b == c) {
            p = 10000 + a * 1000;
        } else if (a == b) {
            p = 1000 + a * 100;
        } else if (b == c) {
            p = 1000 + b * 100;
        } else if (c == a) {
            p = 1000 + c * 100;
        } else {
            p = Math.max(a , Math.max(b, c)) * 100;
        }

        System.out.println(p);
    }
}