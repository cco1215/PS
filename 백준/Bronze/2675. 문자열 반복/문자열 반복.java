import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            String c = sc.next();
            
            // 각 테스트 케이스에 대해 결과를 저장할 StringBuilder
            StringBuilder result = new StringBuilder();
            
            for (int j = 0; j < c.length(); j++) {
                for (int k = 0; k < b; k++) {
                    result.append(c.charAt(j));
                }
            }
            
            // 최종 결과 출력
            System.out.println(result.toString());
        }

        sc.close();
    }
}
