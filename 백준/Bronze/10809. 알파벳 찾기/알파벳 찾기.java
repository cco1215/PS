import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int[] al = new int[26];

        for (int i = 0; i < 26; i++) {
            al[i] = -1;
        }

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            int index = c - 'a';

            if (al[index] == -1) {
                al[index] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(al[i] + " ");
        }
    }
}