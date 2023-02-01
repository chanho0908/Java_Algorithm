import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(recursive(5));
    }

    public static int recursive(int n){
        if (n==1) return 1; // 재귀 함수 종료 조건
        else return n * recursive(n-1);
    }
}
