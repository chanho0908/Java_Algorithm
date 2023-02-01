import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int start = arr[arr.length-1];
        int end = Arrays.stream(arr).sum();
        int mid = (start + end) / 2;
        int i=0;
        int cnt = 0;

        while (i < arr.length ){
            int sum=0;
            while (sum <= mid){
                sum+= arr[i];
                i++;
            }
            System.out.println(sum);
        }
        System.out.println(cnt);

    }

}
