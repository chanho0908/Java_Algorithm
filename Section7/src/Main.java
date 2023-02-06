import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n, e;
    static int[] dis = {1,-1,5};
    static int[] ch;
    public static int BFS(int s, int e){
        Queue<Integer> q = new LinkedList<>();
        ch = new int[10001];
        int L = 0;
        q.offer(s);
        while (!q.isEmpty()){
            int len = q.size();
            for (int i=0; i<len; i++){
                int x = q.poll();
                for (int y : dis){
                    int nv = x + y;
                    if (nv == e) return L+1;
                    if (nv > 0 && nv < 10001 && ch[nv] == 0){
                        ch[nv] = 1;
                        q.offer(nv);

                    }
                }
            }
            L++;
        }

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        e = sc.nextInt();
        System.out.println(BFS(n,e));

    }
}