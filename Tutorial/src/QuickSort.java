import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        sort(arr);
        for (int x : arr) System.out.print(x + " ");
    }

    public static void sort(int[] a) {
        left_pivot_sort(a, 0, a.length - 1);
    }

    /**
     * 중간 피벗 선택 방식
     *
     * @param arr 정렬할 배열
     * @param lt  현재 부분배열의 첫번째 원소
     * @param rt  현재 부분배열의 마지막 원소
     */
    public static void left_pivot_sort(int[] arr, int lt, int rt) {
        /*
         *  lt가 rt 보다 크거나 같다면 정렬 할 원소가
         *  1개 이하이므로 정렬하지 않고 return
         */
        if (lt >= rt) return;

        /*
         * 피벗을 기준으로 요소들이 왼쪽과 오른쪽으로 약하게 정렬 된 상태로
         * 만들어 준 뒤, 최종적으로 pivot의 위치를 얻는다.
         *
         * 그리고나서 해당 피벗을 기준으로 왼쪽 부분리스트와 오른쪽 부분리스트로 나누어
         * 분할 정복을 해준다.
         *
         * [과정]
         *
         * Partitioning:
         *
         *   a[left]          left part              right part
         * +---------------------------------------------------------+
         * |  pivot  |    element <= pivot    |    element > pivot   |
         * +---------------------------------------------------------+
         *
         *
         *  result After Partitioning:
         *
         *         left part          a[lo]          right part
         * +---------------------------------------------------------+
         * |   element <= pivot    |  pivot  |    element > pivot    |
         * +---------------------------------------------------------+
         *
         *  피벗 값을 기준으로 왼쪽에는 피벗보다 작거나 같은 값
         *  오른쪽엔 피벗보다 큰 값들이 위치한다.
         *
         *  result : pivot = lt
         *
         *  Recursion(재귀):
         *
         * l_pivot_sort(a, lo, pivot - 1)     l_pivot_sort(a, pivot + 1, hi)
         *
         *         left part                           right part
         * +-----------------------+             +-----------------------+
         * |   element <= pivot    |    pivot    |    element > pivot    |
         * +-----------------------+             +-----------------------+
         * lo                pivot - 1        pivot + 1                 hi
         *
         */
        int pivot = partition(arr, lt, rt);

        left_pivot_sort(arr, lt, pivot -1); // 왼쪽

        left_pivot_sort(arr, pivot +1, rt); // 오른쪽

    }
    /**
     * pivot을 기준으로 파티션을 나누기 위한 약한 정렬 메소드
     *
     * @param arr		정렬 할 배열
     * @param left	현재 배열의 가장 왼쪽 부분
     * @param right	현재 배열의 가장 오른쪽 부분
     * @return		최종적으로 위치한 피벗의 위치(lo)를 반환
     */
    private static int partition(int[] arr, int left, int right) {

        int lt = left;
        int rt = right;
        int pivot = arr[left]; // 부분리스트의 왼쪽 요소를 피벗으로 설정

        // 엇갈릴 떄 까지 반복
        while(lt < rt) {

            // 피벗 값보다 작은 값을 만날 때 까지 감소
            while(arr[rt] > pivot && lt < rt) {
                rt--;
            }

            // 피벗 값 보다 큰 값을 만날 때 까지 증가
            while(arr[lt] <= pivot && lt < rt) {
                lt++;
            }

            // 교환 될 두 요소를 찾았으면 두 요소를 바꾼다.
            swap(arr, lt, rt);
        }


        /*
         *  마지막으로 맨 처음 pivot 으로 설정했던 위치(arr[left])의 원소와
         *  lt를 가리키는 원소를 바꾼다.
         */
        swap(arr, left, lt);

        // 두 요소가 교환되었다면 피벗이었던 요소는 lt 위치하므로 lt 반환한다.
        return lt;
    }

    private static void swap(int arr[], int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
