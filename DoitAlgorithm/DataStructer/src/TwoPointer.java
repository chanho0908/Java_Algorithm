import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoPointer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 1;
        int start_idx=1;
        int end_idx=1;
        int sum = 1;
        int n = Integer.parseInt(st.nextToken());

        while (end_idx != n){
            if (sum == n){
                answer++;
                end_idx++;
                sum += end_idx;
            } else if (sum > n) {
                sum -= start_idx;
                start_idx++;
            }else {
                end_idx++;
                sum+=end_idx;
            }
        }
        System.out.println(answer);
        System.out.println(solution(n));
    }

    public static int solution(int n){
        int lt=0, sum=0, answer = 0;
        int m = n/2+1;
        int[] arr = new int[m];
        for (int i=0; i<m; i++) arr[i] = i+1;

        for (int rt=0; rt<m; rt++){
            sum += arr[rt];
            if (sum == n) answer++;
            while (sum >= n){
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }
        return answer;
    }
}
