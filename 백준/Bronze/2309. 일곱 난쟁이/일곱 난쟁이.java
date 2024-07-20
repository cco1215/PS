import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            heights[i] = sc.nextInt();
            sum += heights[i];
        }

        int first = -1, second = -1;

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - heights[i] - heights[j] == 100) {
                    first = i;
                    second = j;
                    break;
                }
            }
            if (first != -1) break;
        }

        int[] result = new int[7];
        int index = 0;
        for (int i = 0; i < 9; i++) {
            if (i != first && i != second) {
                result[index++] = heights[i];
            }
        }
        
        Arrays.sort(result);
        for (int i = 0; i < 7; i++) {
            System.out.println(result[i]);
        }

        sc.close();
    }
}
