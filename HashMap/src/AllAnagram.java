/*
    4. 모든 아나그램 찾기
    설명

    S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
    아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.

    입력
    첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.

    S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.

    출력
    S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.

    예시 입력
    bacaAacba
    abc

    예시 출력
    3
 */
import java.util.HashMap;
import java.util.Scanner;

public class AllAnagram {
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
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> nMap = new HashMap<>();

        int len = n.length()-1;
        for (int i=0; i < len; i++) sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) +1);
        for (char x : n.toCharArray()) nMap.put(x, nMap.getOrDefault(x, 0) + 1);

        int lt=0;
        for (int rt=len; rt < s.length(); rt++){
            sMap.put(s.charAt(rt), sMap.getOrDefault(s.charAt(rt), 0) + 1);
            if (sMap.equals(nMap)) answer++;
            sMap.put(s.charAt(lt), sMap.get(s.charAt(lt)) -1);
            if (sMap.get(s.charAt(lt)) == 0 ) sMap.remove(s.charAt(lt));
            lt++;
        }

        return answer;
    }
}
