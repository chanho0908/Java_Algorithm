import java.util.Arrays;
import java.util.Scanner;

public class LeastRecentlyUsed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : solution(s,n,arr)) System.out.println(x + " ");
    }
    // 5 9
    // 1 2 3 2 6 2 3 5 7

    public static int[] solution(int s, int n, int[] arr){
        int[] answer = new int[s];
        for (int x : arr){
            int hit = -1; // 캐시 Hit !
            for (int i=0; i < s; i++) if (x == answer[i]) hit=i; // 캐시의 히트 여부
            if (hit == -1){
                for (int i = s-1; i >= 1; i--){
                    answer[i] = answer[i-1];
                }
            }else{
                for (int i = hit; i >= 1; i--){
                    answer[i] = answer[i-1];
                }
            }
            answer[0] = x;

        }

        return answer;
    }
}
