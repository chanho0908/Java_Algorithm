import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Good {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) arr[i] = Long.parseLong(st.nextToken());

        int cnt = 0;
        Arrays.sort(arr);

        for (int i=0; i<n; i++){
            long target = arr[i];
            int lt=0;
            int rt=n-1;
            while (lt < rt){
                long tmp = arr[lt] + arr[rt];

                if (tmp < target) lt++;
                else if(tmp > target) rt--;
                else {
                    if (lt != i && rt != i){
                        cnt++;
                        break;
                    }else if (lt == i)lt++;
                    else rt++;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
