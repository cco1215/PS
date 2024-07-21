import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[9];
        int max = n[0];
        int index = 0;
        
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
            if (max < n[i]) {
                max = n[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}