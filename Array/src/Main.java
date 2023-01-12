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
    // 9
    // 32 55 62 20 250 370 200 30 100
    // 23 2 73 2 3
    public static void solution(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> nums = new ArrayList<>();
        int num = 0;

        for (int x : arr){
            num = 0;
            while (x > 0){
                int digit = x % 10;
                num = num * 10 + digit;
                x /= 10;
            }
            if (isPrime(num)) System.out.print(num + " ");
        }
    }

    public static boolean isPrime(int num){
        if (num < 2) return false;

        for (int i=2; i <= Math.sqrt(num); i++){
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
