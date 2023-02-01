import java.util.ArrayList;
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

        System.out.println(solution(arr, n, m));

    }
    // 4 3
    //3 4 1 2
    //4 3 2 1
    //3 1 4 2
    public static int solution(int[][] arr, int n, int m){
        int answer = 0;
        for (int i=1; i <= n; i++){
            for (int j=1; j <= n; j++){
                int cnt = 0;
                for (int k = 0; k < m; k++){
                    int posI=0, posJ=0;
                    for (int s = 0; s < n; s++){
                        if (arr[k][s] == i) posI = s;
                        if (arr[k][s] == j) posJ = s;
                    }
                    if (posI < posJ) cnt++;
                }
                if (cnt == m) answer++;
            }
        }

        return answer;

    }

}
