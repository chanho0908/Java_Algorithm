import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            input.add(sc.nextInt());
        }
        solution(input, n);

    }
    // 5
    // 87 89 92 100 76
    public static void solution(ArrayList<Integer> arr, int n) {

        for (int i=0; i < arr.size(); i++){
            int rank = 1;
            for (int j=0; j<arr.size(); j++){
                if (arr.get(i) < arr.get(j)) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }

}
