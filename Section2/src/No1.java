/*
    1. 큰 수 출력하기
    설명

    N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
    (첫 번째 수는 무조건 출력한다)

    입력
    첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.

    출력
    자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
    6
    7 3 9 5 6 12
 */
import java.util.ArrayList;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            input.add(sc.nextInt());
        }
        for (int x : solution(input, n)){
            System.out.print(x + " ");
        }
    }
    //6
    //7 3 9 5 6 12
    public static ArrayList<Integer> solution(ArrayList<Integer> input, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(input.get(0));

        for (int i=1; i < input.size(); i++){
            if (input.get(i) > input.get(i-1)) answer.add(input.get(i));
        }
        return answer;
    }
}
