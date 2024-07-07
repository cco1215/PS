import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        for (int i = 0; i < s; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(n + m);
        }
    }
}