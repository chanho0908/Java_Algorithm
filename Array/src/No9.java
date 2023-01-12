/*
    10 13 10 12 15
    12 39 30 23 11
    11 25 50 53 15
    19 27 29 37 27
    19 13 30 13 19

    N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.

    입력
    첫 줄에 자연수 N이 주어진다.(2<=N<=50)

    두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.


출력
최대합을 출력합니다.
 */
import java.util.Scanner;

public class No9 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        /*
        int[][] arr = {
                { 10, 13, 10, 12, 15}, // 60
                { 12, 39, 30, 23, 11}, // 115
                { 11, 25, 50, 53, 15 }, // 154
                { 19, 27, 29, 37, 27 }, // 139
                { 19, 13, 30, 13, 19 }}; // 94
           // 134 71 117 149 138 87  155*/

            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            sc.nextLine();
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            solution(arr, n);
        }

        public static void solution(int[][] arr, int n) {
            int max = 0;
            int sum1 = 0;
            int sum2 = 0;

            for (int i=0; i < n; i++){
                sum1 = 0;
                sum2 = 0;
                for (int j =0; j < n; j++){
                    sum1 += arr[i][j];
                    sum2 += arr[j][i];
                }
                if (max < sum1) max = sum1;
                if (max < sum2) max = sum2;
            }

            sum1=sum2=0;
            for (int i = 0; i < n; i++){
                sum1 += arr[i][i];
                sum2 += arr[i][n -1 -i];

                if (max < sum1) max = sum1;
                if (max < sum2) max = sum2;
            }
            System.out.println(max);
        }
}
