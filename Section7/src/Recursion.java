import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive(n);
    }

    public static void recursive(int n){
        if (n==0) return; // 재귀 함수 종료 조건
        else {
            //System.out.println(n); // 3 2 1
            recursive(n-1);
            System.out.println(n); // 1 2 3
        }

    }
}

/*
    재귀 함스는 스택 프레임을 사용

      STACK PUSH 순서   |   재귀 함수 동작
        |        |
        |__D(0)__|            D(3)
        |__D(1)__|      pop   D(2)  push
        |__D(2)__|            D(1)
        |__D(3)__|            D(0)
          STACK
 */
