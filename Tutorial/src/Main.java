import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int n = arr.length;
        int tmp = arr[n-1];
        for (int i=n-1; i >= 1; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = tmp;
        System.out.println(Arrays.toString(arr));
    }

}