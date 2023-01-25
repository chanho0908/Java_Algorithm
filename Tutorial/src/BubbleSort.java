public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int tmp=0;
        // 한번 반복할 때 마다 가장 큰 값이 맨 뒤로감!!
        // 다음 값과 비교 했을 때 큰 값을 뒤로 보낸다 !
        for (int i=0; i<arr.length; i++){
            for (int j=0; j < arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }


        for (int x : arr) System.out.println(x);
    }
}
