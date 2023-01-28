/*
    3. 삽입 정렬
    설명

    N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.

    정렬하는 방법은 삽입정렬입니다.


    입력
    첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.

    두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.


    출력
    오름차순으로 정렬된 수열을 출력합니다.


    예시 입력 1

    6
    11 7 5 6 10 9
    예시 출력 1

    5 6 7 9 10 11

 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        solution(n, arr);
        for (int x : arr) System.out.print(x + " ");
    }

    public static int[] solution(int n, int[] arr){
/*
        for (int i=1; i < n; i++){
            int target = arr[i], j;
            for (j = i-1; j >= 0; j--){
                if (target < arr[j]){
                    arr[j+1] = arr[j];
                }else break;
            }
            arr[j+1] = target;
        }*/

        for (int i=1; i < n; i++){
            int j = i-1;
            int target = arr[i];
            while (j >= 0 && arr[j] > target){ // target 보다 작은 값을 찾을 떄 까지!
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = target;
        }
        return arr;
    }
}
