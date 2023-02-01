import java.util.ArrayList;
import java.util.Scanner;

public class No4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 받을 자연수의 개수 입력");

        int n = sc.nextInt();
        ArrayList<String> result;
        ArrayList<String> input = new ArrayList<>();

        System.out.println(n +"개의 단어 입력");
        for(int i=0; i < n; i++){ input.add((sc.next())); }

        result = solution(input);
        for (String x : result) System.out.println(x);
    }

    public static ArrayList<String> solution(ArrayList<String> arr) {
        String answer;
        ArrayList<String> result = new ArrayList<>();

        for (String x : arr){
            char[] c = x.toCharArray();
            int lt = 0, rt = c.length-1;
            while (lt < rt){
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            answer = String.valueOf(c); //중요!!
            result.add(answer);
        }
        return result;
    }
}
