import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer bf = new StringBuffer();
        boolean flag = true;
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int num = 1;
        for (int i=0; i<n; i++) {
            int target = arr[i];
            if (target >= num){
                while (target >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }else {
                int tmp = stack.pop();
                if (tmp > target){
                    flag = false;
                    System.out.println("NO");
                    break;
                }else {
                    bf.append("-\n");
                }
            }
        }
        if (flag) System.out.println(bf);
    }
}
