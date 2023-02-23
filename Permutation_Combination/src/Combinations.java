import java.util.Arrays;
import java.util.Scanner;

// 조합
public class Combinations {
    static int r,n;
    static int[][] dy = new int[35][35];

    public static int DFS(int n, int r){
        if (dy[n][r] > 0) return dy[n][r];
        if (n==r || r == 0) return 1;
        else{
            System.out.println(DFS(n-1, r-1) + DFS(n-1, r));
            return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        DFS(n,r);
    }
}
