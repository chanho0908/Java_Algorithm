/*
    1. 올바른 괄호
    설명

    괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.

    (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.


    입력
    첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.


    출력
    첫 번째 줄에 YES, NO를 출력한다.


    예시 입력 1

    (()(()))(()
    예시 출력 1

    NO

 */
import java.util.Scanner;

public class Bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
    // (()(()))(()

    public static String solution(String s){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(') stack.push(s.charAt(i));

            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) return "NO"; // 닫는 괄호가 많을 떄
                stack.pop();
            }
            if (!stack.isEmpty()) return "NO"; // ( 가 남아있다 >> 여는 괄호가 더 많을 떄
        }

        return answer;
    }
}
