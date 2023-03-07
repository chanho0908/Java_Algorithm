import java.util.Scanner;

public class Combination {
    static int[] combi;
    static int n,m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        DFS(0,1);
    }

    /**
     *
     * @param L 레벨
     * @param s 시작점
     */
    public static void DFS(int L, int s){
        if (L == m){
            for (int x : combi) System.out.print(x + " ");
            System.out.println();
        }else {
            for (int i=s; i<= n; i++){
                combi[L] = i;
                DFS(L+1, s+i);
            }
        }
    }

}
