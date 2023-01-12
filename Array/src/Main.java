import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int[] arr = new int[n + 1];
        int cnt = 0;
        for (int i=2; i <= n; i++) arr[i] = i;

        for (int i = 2; i <= n; i++){
            for (int j = i*i; j <= n; j++){
                if (arr[j] == 0) continue;
                if (arr[j] % i == 0) arr[j] = 0;
            }
            if (arr[i] != 0) cnt++;
        }
        return cnt;
    }

}
