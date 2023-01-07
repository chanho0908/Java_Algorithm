import java.util.ArrayList;
import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            input.add(sc.nextInt());
        }
        System.out.println(solution(input, n));
    }

    public static String solution(ArrayList<Integer> input, int n) {
        String result = String.valueOf(input.get(0));
        for(int i=1; i < n; i++){
            if(input.get(i) > input.get(i-1)) result +=  " " + input.get(i);
        }
        return result;
    }
}
