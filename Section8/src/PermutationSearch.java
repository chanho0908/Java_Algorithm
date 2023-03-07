import java.util.Scanner;

public class PermutationSearch {
    static int n,f;
    static int[] pm,cm, ch;
    static int[][] dy = new int[35][35];
    static boolean flag = false;

    public static int getCombination(int n, int r){
        if (dy[n][r] > 0) return dy[n][r];
        if (n==r || r==0) return 1;
        else return dy[n][r] = getCombination(n-1, r-1) + getCombination(n-1, r);
    }

    public static void DFS(int L, int sum){
        if (flag) return;
        if (L == n){
            if (sum == f){
                for (int x : pm) System.out.print(x + " ");
                flag = true;
            }
        }else {
            for (int i=1; i<= n; i++){
                if (ch[i] == 0){
                    ch[i] = 1;
                    pm[L] = i;
                    DFS(L+1, sum+(cm[L] * pm[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        ch = new int[n+1]; // 정해진 배열이 아닌 1~N 까지 돌아야 하므로 체크 배열이 필요하다.
        pm = new int[n];
        cm = new int[n];

        for (int i=0; i<n; i++) cm[i] = getCombination(n-1, i);
        DFS(0,0);
    }


}
