import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            int b = n % 42;
            a.add(b);
        }

        System.out.println(a.size());
    }
}