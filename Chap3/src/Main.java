import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
        int n = 14;
        int k = 2;
        int max = 0;
        int cnt = 0;
        for (int i=0; i < n; i++){
            if (arr[i] == 0){
                for (int j=0; j<k; j++){
                    arr[i] = 1;
                }
            }
            if (arr[i] == 1) cnt ++;
            else {
                max = Math.max(max, cnt);
                cnt = 0;
            }
        }
        System.out.println(max);
    }
}