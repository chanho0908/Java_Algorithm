import java.util.Scanner;
import java.util.Stack;

public class crane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i=0; i<m; i++) moves[i] = sc.nextInt();
        System.out.println(solution(n, board, m, moves));
    }

    public static int solution(int n, int[][] board, int m, int[] moves){
        int answer=0;
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i < m; i++){
            int target = moves[i]-1;
            for (int j=0; j < n; j++){
                if (board[j][target] != 0){
                    int num = board[j][target];
                    board[j][target] = 0;

                    if (!stack.isEmpty() && stack.peek() == num ) {
                        stack.pop();
                        answer+=2; // 함정... 터지는 횟수가 아니라 터진 인형의 수!!
                    }else stack.push(num);

                    break;

                }
            }
        }
        return answer;
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
