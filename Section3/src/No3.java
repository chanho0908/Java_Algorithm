import java.util.Scanner;

/*
    3. 최대 매출
    설명

    현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.

    만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면

    12 15 11 20 25 10 20 19 13 15

    연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.

    여러분이 현수를 도와주세요.


    입력
    첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.

    두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.

    출력
    첫 줄에 최대 매출액을 출력합니다.

 */
public class No3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) arr[i] =  sc.nextInt();
        System.out.println(solution(arr, n, k));
    }
    // 10 3
    // 12 15 11 20 25 10 20 19 13 15
    // 10 3
    // 100 15 11 20 25 10 20 19 13 15
    public static int solution(int [] arr, int n, int k){
        int answer, sum = 0;
        for (int i=0; i<k; i++) sum+=arr[i];
        answer = sum;

        for (int i=k; i < n; i++){
            sum += arr[i] - arr[i-k];
            /*
                첫번째 합 : 12 15 11에서 다음 합을 구할 경우 i번째 값 20을 더하고 가장 처음 더한 값인
                12를 빼줌으로 써 결과적으로 15 11 20의 합이 된다.
             */

            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
/*
    이 문제를 이중 for문으로 해결할 경우 시간 복잡도는 O(N x X)가 되므로
    O(n) 으로 해결해기 위해 반복문을 한번만 사용한다 => Sliding Window
 */
