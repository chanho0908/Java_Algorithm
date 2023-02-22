import java.util.*;
class Main{
    static int n, total;
    static String answer = "NO";
    static int[] arr;
    static boolean flag = false;
    public static void DFS(int L, int sum){
        if (flag) return;
        if (sum>total/2) return;
        if (L == n){
            if ((total - sum) == total/2){
                answer = "YES";
                flag = true;
            }
        }else {
            DFS(L+1, sum+arr[L]);
            DFS(L+1, sum);

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        total = Arrays.stream(arr).sum();
        DFS(0, 0);
        System.out.println(answer);
    }
}