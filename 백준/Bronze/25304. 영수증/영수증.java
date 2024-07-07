import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int m = sc.nextInt();

        int s = sc.nextInt();

        for (int i = 0; i < s; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += (a * b);
        }
        if (m == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}