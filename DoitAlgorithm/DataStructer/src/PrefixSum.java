
/*
    구간합 공식 : s[j] - s[i-1];

 */

import java.util.*;
import java.io.*;

public class PrefixSum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N+1];

        for(int i=1; i<=N; i++)
            arr[i] = arr[i-1] + sc.nextInt();

        for(int i=0; i<M; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(arr[b] - arr[a - 1]);

        }
    }
}
