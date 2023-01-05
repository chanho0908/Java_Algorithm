import java.util.Scanner;
import java.util.regex.Pattern;

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
        System.out.println("문자열 입력");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("성공 !" + solution(input));
        System.out.println("dsd");
    }

    public static String solution(String input) {
        char[] c = input.toCharArray();
        int lt = 0, rt = c.length - 1;

        while (lt < rt){
            if(Pattern.matches("^[a-zA-z]*$",  String.valueOf(c[lt])) &&
                    Pattern.matches("^[a-zA-z]*$",  String.valueOf(c[rt]))){
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
                System.out.println(lt + "/" + rt);
                System.out.println(String.valueOf(c));
            }else {
                lt++; rt--;
            }
        }
        /*
        * while 안에서 특수문자일 경우의 조건을 지정하지 않아
        * 첫 글자와 마지막 글자막 비교하는 에러 발생
        * */
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

*/
