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

    for(int j = i+i; j <= n; j+=i) arr[j] = 0;
    => 소수의 배수를 걸러내는 과정

 */
public class Eratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }

    public static void solution(int n) {
        int[] arr = new int[n+1];
        int cnt=0;
        for(int i = 2; i <= n; i++) arr[i] = i; // 소수 배열 초기화

        for(int i=2; i <= n; i++){
            for(int j = i+i; j <= n; j+=i) arr[j] = 0;
            if(arr[i] != 0) {
                cnt++;
                System.out.println(arr[i]);
            }
        }
        System.out.println(cnt);
    }
}
