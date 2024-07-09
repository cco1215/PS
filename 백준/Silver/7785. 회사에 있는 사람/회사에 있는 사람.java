import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Set<String> a = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] log = sc.nextLine().split(" ");
            String name = log[0];
            String action = log[1];

            if (action.equals("enter")) {
                a.add(name);
            } else if (action.equals("leave")) {
                a.remove(name);
            }
        }

        List<String> sorted = new ArrayList<>(a);
        sorted.sort(Collections.reverseOrder());

        for (String name : sorted) {
            System.out.println(name);
        }
    }
}