public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        for (int i=1 ; i < arr.length; i++){
            int j = i - 1;
            int target = arr[i];

            // 타겟이 이전 원소보다 크기 전 까지 반복 ex) 3 4(target)
            while (arr[j] >=0 && target < arr[j]){
                arr[j+1] = arr[j]; // 이전 원소를 한 칸씩 뒤로 이동
                j--;
            }

            /*

                1, 10, 5, 8, 7, 6, 4, 3, 2, 9

                이전 과정은 생략하고 오직 4 의 경우에만 봤을 때,

                int j = 5;
                int target = 4;

                while(원소가 0보다 크고 이전 원소보다 클 떄 까지 반복 / 4일 경우 1을 만날 때 까지 ){
                   6 -> 4  j : 4
                   7 -> 4  j : 3
                   8 -> 4  j : 2
                   5 -> 4  j : 1
                   10 -> 4  j : 0
                   1을 만나면 탈출
                }

                이 때, j = 0 >> 첫 번째 원소(1) 뒤에 오게 된다.

             * 위 반복문에서 탈출 하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
             * 타겟 원소는 j번째 원소 뒤에 와야한다.
             * 그러므로 타겟은 j + 1 에 위치하게 된다.
             */
            arr[j+1] = target;
        }
        for (int x : arr) System.out.print(x + " ");
    }
}
