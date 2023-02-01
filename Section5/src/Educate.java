import java.util.*;
import java.util.Queue;

public class Educate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String m = sc.next();

        System.out.println(solution(n,m));
    }
    // CBA
    // CBDAGE
    // ABDCGE
    public static String solution(String a, String b){
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (char x : a.toCharArray()) q.offer(x);

        for (char x : b.toCharArray()){
            if (q.contains(x)){
                if (x != q.poll()) return "NO";
                // 큐를 탐색 했을 때, b 배열의 값의 순서가 일치하면 true
            }
            if (!q.isEmpty()) return "NO"; // 필수 수강과목을 수강하지 않은 경우
        }

        return answer;
    }
}
