/*
2. 공통원소 구하기
    설명

    A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.


    입력
    첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.

    두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.

    세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.

    네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.

    각 집합의 원소는 1,000,000,000이하의 자연수입니다.

 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TowPointers2 {
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

    public static ArrayList<Integer> solution(int[] arr1, int[] arr2, int a, int b){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1=0,p2=0;
        while (p1 < a && p2 < b){
            if (arr1[p1] == arr2[p2]){
                answer.add(arr1[p1++]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            }else {
                p2++;
            }
        }

        return answer;
    }
    /*
    5
    1 3 9 5 2
    5
    3 2 5 7 8
     */
}

