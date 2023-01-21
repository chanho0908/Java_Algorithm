import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
    // 15

    public static int solution(int n) {
        int answer = 0;

        for (int rt=1; rt < n/2 +1; rt++){
            int sum = 0;
            int lt = rt;

            while (sum <= n){
                sum += lt;
                if (sum == n){
                    answer++;
                }
                lt++;
            }

        }

        return answer;
    }

}