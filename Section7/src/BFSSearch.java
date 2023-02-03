/*
    송아지 찾기 (BFS : 상태트리탐색)

    설명
     현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려있다.
     현수의 위치와 송아지의 위치가 수직선사으이 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지
     다음과 같은 방법으로 이동한다. 송아지는 움직이지 않고 제자리에 있다.
     현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞르로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
     최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.

     입력
      첫 번째 줄에 현수의 위치 S와 송아지의 위치 E갖 주어진다. 직선의 좌표 점은 1 부터 10,000까지이다.

     출력
      점프의 최소 횟수를 구한다, 답은 1 이상이며 반드시 존재합니다,

     예시 입력 1
      5 14

     예시 출력 1
     3

 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSSearch {
    int[] dis = {1,-1,5};
    int[] ch;
    Queue<Integer> q = new LinkedList<>();

    public int BFS(int s, int e){
        ch = new int[10001];
        ch[s] = 1; // 출발지점 체크
        q.offer(s);
        int L = 0;
        while (!q.isEmpty()){
            int len  = q.size();
            System.out.print(L + " : ");
            for (int i=0; i<len; i++){
                int x = q.poll();
                for (int z : dis){
                    int nx = x+z;
                    //System.out.print(nx + " ");
                    if (nx==e) return L+1;
                    if (nx >= 1 && nx <=10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            L++;
            //System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        BFSSearch T = new BFSSearch();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // 출발점
        int e = sc.nextInt(); // 송아지 위치
        System.out.println(T.BFS(s,e));
    }
}
