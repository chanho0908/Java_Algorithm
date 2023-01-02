import java.util.Scanner;
import java.util.regex.Pattern;

/*
 2. 대소문자 변환

    설명
    대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

    입력
    첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
    문자열은 영어 알파벳으로만 구성되어 있습니다.

    출력
    첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
*/

public class No2 {
    public static boolean isLower(char c){
        if(Pattern.matches("^[a-z]*$", String.valueOf(c))){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(char s : str.toCharArray()){
            if(Character.isLowerCase(s)){
                result += String.valueOf(s).toUpperCase();
            }else {
                result += String.valueOf(s).toLowerCase();
            }
        }
        System.out.println(result);
    }
}

/* 제출안
public class No2 {
    public static boolean isLower(char c){
        if(Pattern.matches("^[a-z]*$", String.valueOf(c))){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("&#xBB38;&#xC790;&#xC5F4;&#xC744; &#xC785;&#xB825;&#xD558;&#xC138;&#xC694;");
        String str = sc.next();

        for(char s : str.toCharArray()){
            if(isLower(s)){
                result += String.valueOf(s).toUpperCase();
            }else {
                result += String.valueOf(s).toLowerCase();
            }
        }
        System.out.println(result);
    }
}

// 답안1(Character Class)
   class Main{
    public String solution(String str){
       String answer = "";
       for(char x : str.toCharArray()){
           if(Character.isLowerCase(x)) answer += str.toUpperCase();
           else answer += str.toLowerCase();
       }
       return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}

// 답안1(ASCII)
    class Main{

    //ASCII CODE
    // 65 ~ 90  => 영대문자
    // 97 ~ 122 => 영소문자
    public String solution(String str){
       String answer = "";
       for(char x : str.toCharArray()){
           if(x >= 65 && x < 90) answer += (char)(x + 32);
           else answer += (char)(x-32);
       }
       return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
*/