import java.util.Scanner;
import java.util.Stack;

public class Pipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
    // ()(((()())(())()))(())
    public static int solution(String str){
        int answer = 0;
        Stack<Character> st = new Stack<>();

        for (char x : str.toCharArray()){
            if (x == '(') st.push(x);
            else {
                if (st.peek() == '('){
                    st.pop();
                    answer += st.size();
                }else {
                    st.pop();
                    answer++;
                }
            }
        }
        return answer;
    }
}
