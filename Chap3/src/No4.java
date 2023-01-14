import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int arr[] = new int[n];
        for (int i=0; i<n; i++) arr[i] =  sc.nextInt();
        System.out.println(solution(arr, n, k));
    }
    // 8 6
    // 1 2 1 3 1 1 1 2
    public static int solution(int [] arr, int n, int m){
        int answer=0, sum = 0;

        for (int i=0; i<n; i++){
            sum = 0;
            for (int j=i; j<n; j++){
                sum += arr[j];
                if (sum == m){
                    answer++;
                    break;
                }
                if (sum > m) break;
            }
        }

        return answer;
    }
}
