import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        sc.nextLine();
        for (int i = 0; i < a; i++) arr1[i] = sc.nextInt();

        int b = sc.nextInt();
        int[] arr2 = new int[b];
        sc.nextLine();
        for (int i = 0; i < b; i++) arr2[i] = sc.nextInt();
        for (int x : solution(arr1, arr2, a, b)){
            System.out.print(x + " ");
        }
    }
    public static ArrayList<Integer> solution(int [] arr1, int [] arr2, int a, int b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while (p1 < a && p2 < b){
            if (arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }

        while (p2 < b) answer.add(arr2[p2++]);

        return answer;
    }
}