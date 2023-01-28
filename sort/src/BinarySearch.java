import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(BinarySearch(n, m, arr));
    }

    public static int BinarySearch(int n, int m, int[] arr){
        int start = 0;
        int end = n-1;
        int mid = (start+end)/2;
        Arrays.sort(arr);
        while (start <= end){
            if (arr[mid] == m) return mid+1;
            else if (arr[mid] < m) start = mid + 1;
            else end = mid-1;

            mid = (start+end) / 2;
        }

        return mid;
    }
}
