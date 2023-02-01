import java.util.Scanner;

public class Recursion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive(n);
    }

    public static void recursive(int n){
        if (n ==0) return; // 재귀 함수 종료 조건
        else {
            //System.out.println(n); // 3 2 1
            recursive(n / 2);
            System.out.print(n%2 + " "); // 1 2 3
        }
    }
}
