import java.io.*;
import java.util.*;

public class Prefix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n+1][n+1];
        int[][] sArr = new int[n+1][n+1];

        for (int i=1; i <= n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j=1; j <= n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=1; i <=n; i++){
            for (int j=1; j <=n; j++){
                sArr[i][j] = sArr[i-1][j] + sArr[i][j-1] - sArr[i-1][j-1] + arr[i][j];
            }
        }

        for (int i=0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            if (x1 == x2 && y1 == y2) System.out.println(arr[x1][y1]);
            else {
                int sum = sArr[x2][y2] - sArr[x1-1][y2] - sArr[x2][y1-1] + sArr[x1-1][y1-1];
                System.out.println(sum);
            }
        }

    }
}
