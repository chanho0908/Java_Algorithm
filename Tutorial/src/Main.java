public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        sort(arr);
        for (int x : arr) System.out.print(x + " ");
    }

    public static void sort(int[] a) {
        l_pivot_sort(a, 0, a.length - 1);
    }

    /**
     *  왼쪽 피벗 선택 방식
     * @param a		정렬할 배열
     * @param lo	현재 부분배열의 왼쪽
     * @param hi	현재 부분배열의 오른쪽
     */
    private static void l_pivot_sort(int[] a, int lo, int hi) {

        /*
         *  lo가 hi보다 크거나 같다면 정렬 할 원소가
         *  1개 이하이므로 정렬하지 않고 return한다.
         */
        if(lo >= hi) {
            return;
        }

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
         *
         *  result : pivot = lo
         *
         *
         *  Recursion:
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
        int pivot = partition(a, lo, hi);

        l_pivot_sort(a, lo, pivot - 1);
        l_pivot_sort(a, pivot + 1, hi);
    }



    /**
     * pivot을 기준으로 파티션을 나누기 위한 약한 정렬 메소드
     *
     * @param a		정렬 할 배열
     * @param left	현재 배열의 가장 왼쪽 부분
     * @param right	현재 배열의 가장 오른쪽 부분
     * @return		최종적으로 위치한 피벗의 위치(lo)를 반환
     */
    private static int partition(int[] a, int left, int right) {

        int lt = left;
        int rt = right;
        int pivot = a[left];		// 부분리스트의 왼쪽 요소를 피벗으로 설정

        // lo가 hi보다 작을 때 까지만 반복한다.
        while(lt < rt) {

            /*
             * hi가 lo보다 크면서, hi의 요소가 pivot보다 작거나 같은 원소를
             * 찾을 떄 까지 hi를 감소시킨다.
             */
            while(a[rt] > pivot && lt < rt) {
                rt--;
            }

            /*
             * hi가 lo보다 크면서, lo의 요소가 pivot보다 큰 원소를
             * 찾을 떄 까지 lo를 증가시킨다.
             */
            while(a[lt] <= pivot && lt < rt) {
                lt++;
            }

            // 교환 될 두 요소를 찾았으면 두 요소를 바꾼다.
            swap(a, lt, rt);
        }


        /*
         *  마지막으로 맨 처음 pivot으로 설정했던 위치(a[left])의 원소와
         *  lo가 가리키는 원소를 바꾼다.
         */
        swap(a, left, lt);

        // 두 요소가 교환되었다면 피벗이었던 요소는 lo에 위치하므로 lo를 반환한다.
        return lt;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}