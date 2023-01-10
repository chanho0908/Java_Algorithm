import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
    10. 가장 짧은 문자거리
    설명
    한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

    입력
    첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
    문자열의 길이는 100을 넘지 않는다.

    출력
    첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 */
public class No10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);
        for (Integer x : solution(s,t)){
            System.out.println(x);
        }
        System.out.println("#####################");
        for (Integer x : Main(s,t)){
            System.out.println(x);
        }
    }

    public static int[] solution(String s, char t) {
        int cnt1 = 0, cnt2=0;
        int[] answer = new int[s.length()];
        ArrayList<Integer> result = new ArrayList<>();

        for (int i=0; i < s.length()-1; i++){
            if(s.charAt(i) == t) cnt1 = 0;
            else cnt1++;
            answer[i] = cnt1;
        }

        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == t) cnt2 = 0;
            else cnt2++;
            result.add(cnt2);
        }
        Collections.reverse(result);

        for (int i=0; i < s.length() -1; i++){
            if(answer[i] > result.get(i)){
                answer[i] = result.get(i);
            }
        }

        return answer;
    }
    //teachermode
    // 답안
    public static int[] Main(String s, char t) {
        int cnt=0;
        int[] answer = new int[s.length()];

        for (int i=0; i < s.length()-1; i++){
            if(s.charAt(i) == t) cnt = 0;
            else cnt++;
            answer[i] = cnt;
        }

        cnt = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == t) cnt = 0;
            else cnt++;
            answer[i] = Math.min(answer[i], cnt);
        }

        return answer;
    }
}
