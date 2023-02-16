/*
    1253
    문제
    N개의 수 중에서 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있다면 그 수를 “좋다(GOOD)”고 한다.

    N개의 수가 주어지면 그 중에서 좋은 수의 개수는 몇 개인지 출력하라.

    수의 위치가 다르면 값이 같아도 다른 수이다.

    입력
    첫째 줄에는 수의 개수 N(1 ≤ N ≤ 2,000), 두 번째 줄에는 i번째 수를 나타내는 Ai가 N개 주어진다. (|Ai| ≤ 1,000,000,000, Ai는 정수)

    출력
    좋은 수의 개수를 첫 번째 줄에 출력한다.

    예제 입력 1
    10
    1 2 3 4 5 6 7 8 9 10
    예제 출력 1
    8

 */
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
                    if (lt != i && rt != i)
                    {
                        cnt++;
                        break;
                    }
                    else if (lt == i)lt++;
                    else rt--;
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
