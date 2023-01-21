import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
    10. 봉우리
    설명
    지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
    각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
    격자의 가장자리는 0으로 초기화 되었다고 가정한다.

    5
    5 3 7 2 3
    3 7 1 6 1
    7 2 5 3 4
    4 3 6 4 1
    8 7 3 5 2

 */
public class No10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];

        for (int i = 1; i < n +1; i++){
            for (int j=1; j < n + 1; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr, n));
    }

    public static int solution(int[][] arr, int n){
        int cnt=0;
        for(int i=1; i < n + 1; i++){
            for (int j=1; j < n + 1; j++){
                if(arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i+1][j]
                        && arr[i][j] > arr[i][j+1] && arr[i][j] > arr[i][j-1] ){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
