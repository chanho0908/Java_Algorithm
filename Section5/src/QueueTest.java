import java.util.EmptyStackException;
import java.util.NoSuchElementException;

class Queue{
    class Node<T>{
        //LinkedList 는 데이터 값과 다음 데이터의 주소값을 가지기 때문에 두 개의 필드 값이 필요하다.
        private T data; // 데이터
        private Node<T> next; // 다음 데이터

        public Node(T data){
            this.data = data;
        }

        public Node<T> first;
        public Node<T> last;

        public void add(T item){
            Node<T> t = new Node<>(item);

            if (last != null){
                last.next = t;
            }
            last = t;
            if (first == null){
                first = last;
            }
        }

        public T remove(){
            if (first == null){
                throw new NoSuchElementException();
            }
            T data = first.data;
            first = first.next;

            if (first == null) last = null;
            return data;
        }

        public T peek(){
            if (first == null){
                throw new EmptyStackException();
            }

            return first.data;
        }

        public boolean isEmpty(){
            return first == null;
        }
    }
}

public class QueueTest {
    public static void main(String[] args) {

    }
}
