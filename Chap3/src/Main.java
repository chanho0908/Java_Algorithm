import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 1, 1, 1, 2};
        int m = 6;
        int n = 8;
        int sum = 0;
        int cnt = 0;
        for (int i=0; i<n; i++){
            sum = 0;
            for (int j=i; j<n; j++){
                sum += arr[j];
                System.out.println(arr[i] + " 수열 sum : " + sum);
                if (sum == m){
                    cnt++;
                    break;
                }
                if (sum > m) break;
            }
        }
        System.out.println(cnt);
    }
}