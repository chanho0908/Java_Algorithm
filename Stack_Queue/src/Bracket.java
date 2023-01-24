import java.util.ArrayList;
import java.util.HashMap;
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
