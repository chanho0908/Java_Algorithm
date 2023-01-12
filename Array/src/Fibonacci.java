/*
    4. 피보나치 수열
    설명

    1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
    2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.

    입력
    첫 줄에 총 항수 N(3<=N<=45)이 입력된다.

    출력
    첫 줄에 피보나치 수열을 출력합니다.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int x : solution(n) ) System.out.print(x + " ");

        //System.out.println(fibonacci(n));
        //notUseFor(n);
    }

    // 반복문
    public static ArrayList<Integer> solution(int number) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(1);

        for(int i=2; i < number; i++){
            result.add(result.get(i-2) + result.get(i-1));
        }
        return result;
    }

    // 재귀함수
    public static int fibonacci(int number){
        if(number == 1){
            return 1;
        } else if (number == 2) {
            return 1;
        } else {
            return fibonacci(number - 2) + fibonacci(number - 1);
        }
    }

    // for 사용 x
    public static void notUseFor(int n){
        int a=1, b=1, c;
        System.out.println(a + " " + b + " ");
        for(int i=2; i<n; i++){
            c = a + b;
            System.out.println(c + " ");
            a=b;
            b=c;
        }
    }
}
