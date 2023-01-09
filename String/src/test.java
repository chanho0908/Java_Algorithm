import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n+1];
        sc.nextLine();
        for (int i=0; i < n; i++){
            arr[i] = sc.nextLine();
        }

        for (String x : solution(arr, n)){
            System.out.println(x);
        }

    }

    public static String[] solution(String[] arr, int n) {
        String[] answer = new String[n+1];

        int i = 0;
        for (String x : arr) {
            answer[i] = new StringBuilder(x).reverse().toString();
            i++;
        }
        return answer;
    }
}
