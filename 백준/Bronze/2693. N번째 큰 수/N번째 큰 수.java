import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[][] num = new Integer[n][10];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                num[i][j] = sc.nextInt();
            }
            Arrays.sort(num[i], Collections.reverseOrder());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(num[i][2]);
        }
    }
}