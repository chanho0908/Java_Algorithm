import java.util.Scanner;

/*
    5. 특정 문자 뒤집기
    설명
    영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
    특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

    입력
    첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

    출력
    첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 */
public class No5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String input) {
        char[] c = input.toCharArray();
        int lt = 0, rt = c.length - 1;

        while (lt < rt){
            if(!Character.isAlphabetic(c[lt])) lt++;
            else if (!Character.isAlphabetic(c[rt])) rt--;
            else{
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        //a#b!GE*T@S
        return String.valueOf(c);
    }
}
/*답안
public class Main {

    public static void main(String[] args) {
        System.out.println("문자열 입력");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String input) {
        char[] c = input.toCharArray();
        int lt = 0, rt = c.length-1;
        while (lt < rt){
            if(!Character.isAlphabetic(c[lt])) lt++;
            else if (!Character.isAlphabetic(c[rt])) rt--;
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(c);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }
    //a#b!GE*T@S
    //S#T!EG*b@a
    // kj#$stpj
    // jp #$ts jk 정답
    // jp #$st jk
    public static String solution(String s){
        char[] c = s.toCharArray();
        for (int i=0; i < c.length / 2; i++){
            if(Character.isAlphabetic(c[i]) && Character.isAlphabetic(c[c.length-i-1])){
                char tmp = c[i];
                c[i] = c[c.length-i -1];
                c[c.length-i -1] = tmp;
            }
        }
        return String.valueOf(c);
    }
}

*/
