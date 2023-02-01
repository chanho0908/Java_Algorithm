import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++ ) arr[i] = sc.nextInt();
        System.out.println(solution(n, arr));
    }

    public static String solution(int n, int[] arr){
        String answer="U";
        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr){
            map.put(x, map.getOrDefault(x, 0)+1);
            if (map.get(x) > 1) answer = "D";
        }


        return answer;
    }
}
