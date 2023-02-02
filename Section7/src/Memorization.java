import java.util.ArrayList;

/*
    반복문과 재귀 함수를 사용 했을 때 성능의 차이 :
     재귀 함수를 사용하게 되면 스택 프레임을 사용하기 때문에
     메모리의 낭비가 생겨 성능이 더 낮다.

 */
public class Memorization {
    static int[] fibo;
    public static void main(String[] args) {
        int n = 45;

        // 반복문
        System.out.println("반복문");
        for (int x : DFS(n)){
            //System.out.print(x+" ");
        }
        /*
        System.out.println("\n수열 모두 출력 1");
        // 수열 모두 출력
        for (int i=1; i<=n; i++) System.out.print(recursive(i) + " ");
        System.out.println("\n재귀함수");

        // 재귀 함수
        System.out.println(recursive(n));
        */

        //Memorization 활용
        fibo = new int[n+1];
        long beforeTime = System.currentTimeMillis();

        memorization(n);
        for (int i=1; i<=n; i++) System.out.print(fibo[i] + " ");

        long afterTime = System.currentTimeMillis();
        System.out.println("\n실행 시간 : " + (afterTime-beforeTime));
    }

    //반복문
    public static ArrayList<Integer> DFS(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);

        for (int i=2; i<n; i++){
            int sum = arr.get(i-1) + arr.get(i-2);
            arr.add(sum);
        }
        return arr;
    }
    /*
    public static int recursive(int n){
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = recursive(n-2) + recursive(n-1);
    }*/

    public static int memorization(int n){
        if (fibo[n] > 0) return fibo[n]; // 이미 노드상에 존재하는 결과값을 사용한다.
        if (n==1) return fibo[n] = 1;
        else if (n==2) return fibo[n] = 1;
        else return fibo[n] = memorization(n-2) + memorization(n-1);
    }
}
