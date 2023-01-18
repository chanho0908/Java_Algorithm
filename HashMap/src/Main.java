import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println(solution(n, str));

    }
    //15
    //BACBACCACCBDEDE
    public static char solution(int n, String str){
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : str.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) +1);
        }

        int max = Integer.MIN_VALUE;
        for (char x : map.keySet()){
            int value = map.get(x);
            max = Math.max(max, value);
            if (max == value) answer = x;
        }

        return answer;

    }
}