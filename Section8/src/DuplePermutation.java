import java.util.Scanner;

/*
    중복 순열 구하기

    1부터 N가지 번호가 적힌 구슬이 있습니다. 이 중 중복을 허락하여 M번을 뽑아 일렬로 나열하는 방법을 모두 출력합니다.

    입력 설명
    첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N)이 주어집니다.

    출력설명
    첫 번째 줄에 결과를 출력합니다.

    입력 예제 1
    3 2

 */
public class DuplePermutation {
    static int n,m, answer=0;
    static int[] pm;

    public static void DFS(int L){
        if (L==m){
            for (int x : pm) System.out.print(x + " ");
            answer++;
            System.out.println();
        }else {
            for (int i=1; i<=n; i++){
                pm[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        DFS(0);
        System.out.println(answer);
    }
}
