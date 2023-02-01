import java.util.EmptyStackException;

class Stack<T>{
    class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }

    private Node<T> top;

    // 가장 위의 값을 꺼내는 메소드
    public T pop(){
        if (top == null){
            throw new EmptyStackException();
        }

        // pop을 하기 전 다음 값을 top으로 만들어 주어야 한다.
        T item = top.data;
        top = top.next;
        return item;
    }

    // 값을 추가하는 메소드
    public void push(T item){
        Node<T> t = new Node<>(item);
        t.next = top;
        top = t;
    }

    public T peek(){
        if (top == null){
            throw new EmptyStackException();
        }

        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
}

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
