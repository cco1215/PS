import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder aa = new StringBuilder();
        int n = sc.nextInt();
        int a = 0;

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (k > a) {
                for (int j = a+1; j <=k; j++) {
                    stack.push(j);
                    aa.append('+').append('\n');
                }
                a = k;
            }
            else if (stack.peek() != k) {
                System.out.print("NO");
                return;
            }

            stack.pop();
            aa.append('-').append('\n');
        }

        System.out.println(aa);
    }
}
