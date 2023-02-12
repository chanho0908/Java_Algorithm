import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        int answer = 0;
        int i=0;
        int j=n-1;
        Arrays.sort(arr);
        while (i < j){
            if (arr[i] + arr[j]  < m) i++;
            else if (arr[i] + arr[j] > m) j--;
            else {
                i++;
                j--;
                answer++;
            }
        }
        System.out.println(answer);

    }
}