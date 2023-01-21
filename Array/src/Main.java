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
        for (int x : solution(input, n)) System.out.print(x + " ");

    }
    //9
    //32 55 62 20 250 370 200 30 100
    public static ArrayList<Integer> solution(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> rs = new ArrayList<>();

        for (int x : arr){
            int num = 0;
            while (x > 0){
                int digit = x % 10;
                num = num * 10 + digit;
                x /= 10;
            }
            rs.add(num);
        }

        return rs;
    }

    public static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i=2; i < Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}
