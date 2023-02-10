import java.util.Scanner;

public class No10986 {
    static int n,m;
    static long[] arr,cnt;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        long answer = 0;
        arr = new long[n+1];
        cnt = new long[m+1];

        arr[0] = sc.nextInt();
        for (int i=1; i < n; i++){
            arr[i] = arr[i-1] + sc.nextInt();;
        }

        for (int i=0; i<n; i++){
            int sum = (int) (arr[i] % m);
            if (sum == 0) answer++;
            cnt[sum]++;
        }

        for (int i=0; i<m; i++){
            if (cnt[i] > 1){
                answer += cnt[i] * (cnt[i]-1) / 2;
            }
        }

        System.out.println(answer);
    }
}
