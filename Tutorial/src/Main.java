public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        for (int i = 1; i< arr.length; i++){
            int j = i-1;
            int target = arr[i];

            while (arr[j] >=0 && target < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = target;
        }
        for (int x : arr) System.out.print(x + " ");
    }
}