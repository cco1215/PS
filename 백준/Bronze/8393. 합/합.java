import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        int sum = 0;
        int i = 0;

        while (i < s) {
            sum += s;
            s--;
        }
        System.out.println(sum);
    }
}