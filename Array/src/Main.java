import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        sc.nextLine();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= 5; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        solution(arr, n);
    }
    public static void solution(int[][] arr, int n) {
        int max = 0;
        int rs = 0;

        for (int i=1; i <= n; i++){ //학생 번호
            int cnt = 0;
            for (int j=1; j <= n; j++){
                for (int k = 1; k <= 5; k++){
                    if (arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if (max < cnt){
                max = cnt;
                rs = i;
            }
        }
        System.out.println(rs);
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.print(usedMemory + " bytes");
    }
}
