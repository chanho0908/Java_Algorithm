import java.io.BufferedWriter;
import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<ArrayList<Integer>> graph;
    static Queue<Integer> q = new LinkedList<>();
    static int n, m;
    static int[] dis;
    static int[] ch;
    public static void BFS(int v){
        q.offer(v);
        ch[v] = 1;

        while (!q.isEmpty()){
            int tmp = q.poll();
            for (int x : graph.get(tmp)){
                if (ch[x] == 0){
                    ch[x] = 1;
                    dis[x] = dis[tmp] + 1;
                    q.offer(x);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        ch = new int[n+1];
        dis = new int[n+1];
        graph = new ArrayList<>();
        for (int i=0; i<=n; i++) graph.add(new ArrayList<>());

        for (int i=0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        BFS(1);

        for (int i=2; i <= n; i++) System.out.println(i + ":" + dis[i]);
    }
}