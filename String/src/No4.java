import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
/*
    4. 단어 뒤집기
    설명

    N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.


    입력
    첫 줄에 자연수 N(3<=N<=20)이 주어집니다.

    두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

    출력
    N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 */
public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 받을 자연수의 개수 입력");
        int n = sc.nextInt();
        ArrayList<String> result = new ArrayList<>();

        System.out.println(n +"개의 단어 입력");
        for(int i=0; i <= n; i++){ result.add(solution(sc.nextLine())); }
        for (String x : result) System.out.println(x);
    }

    public static String solution(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();
    }


}