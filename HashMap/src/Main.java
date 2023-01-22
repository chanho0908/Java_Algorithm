import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(solution(str1, str2));

    }
    // AbaAeCe
    // baeeACA
    public static String solution(String a, String b){
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : a.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : b.toCharArray()){
            if (!map.containsKey(x) || map.get(x) == 0){
                return "NO";
            }
            map.put(x, map.get(x)-1);
        }


        return answer;
    }
}