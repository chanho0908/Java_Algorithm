import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class test {
    public static void main(String[] args) {
        String a = "CBA";
        String b = "CBDAGE";
        Queue<Character> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (char x : b.toCharArray()) q.offer(x);
        for (char x : a.toCharArray()) {
            int cnt=0;
            if (q.contains(x)){
                while (q.poll().equals(x)) arr.add(cnt++);
                System.out.println(q.size());
            }
        }
        System.out.println(Arrays.toString(arr.toArray()));
    }
}
