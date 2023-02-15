// 스택을 이용한 오름차순 정렬

import java.util.Stack;

public class StackSort {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(6);
        st.push(1);
        st.push(5);
        sort(st);
        while (!st.isEmpty()) System.out.println(st.pop());
    }

    private static void sort(Stack<Integer> s1){
        Stack<Integer> s2 = new Stack<>();

        while (!s1.isEmpty()){
            int tmp = s1.pop(); // 스택에서 값을 꺼내서
            while (!s2.isEmpty() && s2.peek() > tmp){
                // 두 번째 스택이 비어있지 않고 두 번째 스택의 값이 더 크다면
                s1.push(s2.pop()); // 그 값을 꺼내고
            }
            s2.push(tmp); // 더 작은 값을 스택에 넣는다.
        }

        while (!s2.isEmpty()) s1.push(s2.pop());
    }
}
