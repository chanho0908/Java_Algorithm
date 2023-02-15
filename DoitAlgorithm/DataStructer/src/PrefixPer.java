import java.util.Scanner;

public class PrefixPer {
    static int n,m;
    static long[] arr,cnt;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        long answer = 0;
        arr = new long[n+1];
        cnt = new long[m];

        for (int i=1; i <= n; i++){
            long val =  (arr[i-1] + sc.nextInt()) % m;
            arr[i] = val;
            if (val == 0) answer++;
            cnt[(int)val]++;
        }

        for (int i=0; i<m; i++){
            if (cnt[i] > 1){
                answer += cnt[i] * (cnt[i]-1) / 2;
            }
        }

        System.out.println(answer);
    }
}
