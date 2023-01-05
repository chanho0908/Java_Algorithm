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
        System.out.println("문자열 입력");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("찾을 문자 입력");
        char s = sc.nextLine().charAt(0);
        for (int x:solution(input, s)){
            System.out.println(x + "");
        }

    }
    // 1 0 1 2 1 0 1 2 2 1 0
    // t e a c h e r m o d e
    // 1 0 1 2 3 0 1 2 3 4 0
    public static int[] solution(String input, char s) {
        String str = input.toLowerCase();
        int[] answer = new int[input.length()];
        int cnt=0;

        for(int i=0; i < input.length(); i++){
            if(str.charAt(i) == s){
                cnt = 0;
                answer[i] = cnt;
            }else {
                cnt++;
                answer[i] = cnt;
            }
        }
        return answer;
    }
}
