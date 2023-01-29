import java.util.Arrays;
import java.util.Scanner;

public class Stable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(solution(n,m, arr));

    }

    public static int solution(int n, int m, int[] arr){
        Arrays.sort(arr); // 이분 탐색을 위해선 배열이 정렬 되어 있어야 한다.
        int start=1;
        int end = arr[n-1];
        int answer = 0;

        while (start <= end){
            int mid = (start + end) / 2;
            if (count(m, arr) >= m){ // 말의 마릿수가 남을 때
                answer = mid;        // ex) 마굿간의 간격을 1로 한다면 총 5마리를 배치할 수 있다
                start = mid+1;       // => 시작점의 범위를 좁혀가며 가장 최선의 답을 구한다
            }else end = mid-1;
        }
        return answer;
    }

    /**
     * @param capacity 마굿간의 최대 길이
     * @param arr      마굿간
     * @return         마굿간의 거리에 따른 배치 가능한 말의 수
     */
    public static int count(int capacity, int[] arr){
        Arrays.sort(arr);
        int cnt = 1; // 말의 마릿수
        int ep = arr[0]; // 말을 배치하는 위치
        for (int x : arr){
            if (x - ep >= capacity ) {
                cnt++;
                ep = x;
            }
        }

        return cnt;
    }
}
