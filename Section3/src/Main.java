import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) arr[i] =  sc.nextInt();
        System.out.println(solution(arr, n, k));
    }
    // 14 2
    // 1 1 0 0 1 1 0 1 1 0 1 1 0 1
    public static int solution(int [] arr, int n, int k) {
        int answer = 0;

        int cnt = 0;
        int lt = 0;
        for (int i=0; i<n; i++){
            if (arr[i] == 0 ) cnt++;

            while (cnt > k){
                cnt--;
                lt++;
            }
            answer = Math.max(answer, lt);
        }

        return answer;
    }

}