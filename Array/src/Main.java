import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 4
        int m = sc.nextInt(); // 3
        int[][] arr = new int[m][n];

        for(int i=0; i < m; i++){
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        solution(arr, m, n);
    }
    public static void solution(int[][] arr, int m, int n) {
        int answer = 0;
        for (int i=1; i <= n; i++){
            for (int j=1; j <= n; j++){ // (i, j) 1~n번 학생이 (멘토,멘티)가 될 수 있는 경우의 수
                int cnt = 0;
                for (int s = 0; s < m; s++){ // 테스트 횟수
                    int posI =0, posJ = 0;  // 등수
                    for (int k=0; k < n; k++){
                        if (arr[s][k] == i) posI = k;
                        if (arr[s][k] == j) posJ = k;
                    }
                    if (posI > posJ) cnt++;
                }
                if (cnt == m) answer++;
            }
        }

    }
}
