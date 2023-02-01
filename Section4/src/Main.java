import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String n = sc.nextLine();
        System.out.println(solution(s,n));

    }
    // bacaAacba
    // abc
    public static int solution(String s, String n){
        int answer = 0;
        int len = n.length()-1;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> myMap = new HashMap<>();

        for (int i=0; i < len; i++) map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) +1 );
        for (char x : n.toCharArray()) myMap.put(x, myMap.getOrDefault(x, 0) + 1);

        int lt = 0;
        for (int rt = len; rt < s.length(); rt++){
            map.put(s.charAt(rt), map.getOrDefault(s.charAt(rt), 0) +1 );
            if (map.equals(myMap)) answer++;
            map.put(s.charAt(lt), map.get(s.charAt(lt))-1);
            if (map.get(s.charAt(lt)) == 0) map.remove(s.charAt(lt));
            lt++;

        }

        return answer;
    }
}