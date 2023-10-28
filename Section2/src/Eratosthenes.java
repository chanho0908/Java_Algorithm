import java.util.ArrayList;
import java.util.Scanner;

/*
    5. 소수(에라토스테네스 체)
    설명
    자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
    만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

    입력
    첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.

    출력
    첫 줄에 소수의 개수를 출력합니다.

    에라토스테네스 체
    1. n + 1만큼의 배열을 생성하고 0으로 초기화
      tip! 배열의 초기값으느 0이므로 0으로 초기화 하지 않아도 된다.

    2. 반복문을 생성하여 2부터 n까지 반복할 때,
       2부터 7까지의 배수를 모두 제거한다

 */
public class Eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int cnt = 0;
        int[] arr = new int[n+1];
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i=2; i <= n; i++){
            if (arr[i] == 0){
                cnt++;
                //prime.add(arr[i]); // 소수만 출력할 때
                for (int j=i+i; j <= n; j+=i){
                    arr[j] = 1;
                }
            }
        }
        //for (int x : prime) System.out.print(x + " ");
        return cnt;
    }
}
