import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n,k,arr)){
            System.out.println(x + " ");
        }
    }
    // 7 4
    // 20 12 20 10 23 17 10
    public static ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int x : map.keySet()){
            System.out.println(x + " " + map.get(x));
        }

        return answer;
    }
}
