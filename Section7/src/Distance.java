import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Distance {
    static int n,m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void BFS(int v){
        Queue<Integer> q = new LinkedList();
        ch[v] = 1;
        dis[v] = 0;
        q.offer(v);
        while (!q.isEmpty()){
            int cv = q.poll();
            for (int nv : graph.get(cv)){
                if (ch[nv] == 0){
                    ch[nv] = 1;
                    q.offer(nv);
                    dis[nv] = dis[cv] + 1;

                }
            }
        }
    }

    public static void main(String[] args) {
        Distance D = new Distance();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        for (int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        ch = new int[n+1];
        dis = new int[n+1];
        for (int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        D.BFS(1);
        for(int i=2; i<=n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
