import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
        //System.out.println(calculator(str));
    }

    public static int solution(String str){
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()){
            if (isOperator(x)){

                int b = stack.pop();
                int a = stack.pop();

                stack.push(postfix(a, b, x));

            }else stack.push(Character.getNumericValue(x));
        }

        return stack.pop();
    }

    public static boolean isOperator(char c){
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%' ) {
            return true;
        }
        return false;
    }

    public static int postfix(int a, int b, char c){
        switch (c){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            case '%':
                return a%b;
        }
        return 0;
    }

    // 두번 째 방법
    public static int calculator(String str){
        Stack<Integer> stack = new Stack<>();

        for (char x : str.toCharArray()){
            if (Character.isDigit(x)) stack.push(x-48); // 문자 > 숫자
            else  {
                int b = stack.pop();
                int a = stack.pop();
                if (x == '+') stack.push(a+b);
                else if (x == '-') stack.push(a-b);
                else if (x == '*') stack.push(a*b);
                else if (x == '/') stack.push(a/b);
                else if (x == '%') stack.push(a%b);
            }
        }

        return stack.peek();
    }
}
