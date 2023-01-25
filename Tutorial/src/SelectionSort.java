import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int tmp = 0;
        int index = 0;
        int min = Integer.MAX_VALUE;
        // 한번 정렬이 끝났을 때, 가장 작은 값을 앞으로 보낸다 !!
        for (int i=0; i < arr.length-1; i++){
            for (int j=i+1; j < arr.length; j++){ // 자기 자신과 비교할 필요가 없당
                if (arr[i] < arr[j]){
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for (int x : arr) System.out.println(x);
    }
}
