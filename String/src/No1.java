import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

// 최종본
public class No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        String s;

        System.out.println("문자열을 입력해주세요.");
        while (true){
            str = sc.next();
            if(!isEnglish(str)){
                System.out.println("영어만 입력해 주세요");
            }else if (str.length() > 100){
                System.out.println("100글자 이하로 입력 해주세요");
            }else {
                break;
            }
        }

        System.out.println("찾을 문자를 입력해주세요.");
        while (true){
            s = sc.next();
            if(!isEnglish(s)){
                System.out.println("영어만 입력해 주세요");
            }else if (s.length() > 1){
                System.out.println("한글자 이하로 입력 해주세요");
            } else {
                break;
            }
        }

        int cnt=0;
        for(char x : str.toCharArray()){ if(x == s.charAt(0)) cnt++; }
        System.out.println(cnt);
    }

    public static boolean isEnglish(String str){
        if(!Pattern.matches("^[a-zA-z]*$", str)){
            return false;
        }else {
            return true;
        }
    }
}

/*
public class No1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        String findChar = "";
        ArrayList<Character> chars = new ArrayList<>();

        System.out.println("문자열을 입력해주세요.");
        while (true){
            str = sc.next();
            if(!isEnglish(str)){
                System.out.println("영어만 입력해 주세요");
            }else if (str.length() > 100){
                System.out.println("100글자 이하로 입력 해주세요");
            }else {
                break;
            }
        }

        System.out.println("찾을 문자를 입력해주세요.");
        while (true){
            findChar = sc.next();
            if(!isEnglish(findChar)){
                System.out.println("영어만 입력해 주세요");
            }else if (findChar.length() > 100){
                System.out.println("100글자 이하로 입력 해주세요");
            } else {
                break;
            }
        }

        for(int i=0; i<str.length(); i++){ chars.add(str.charAt(i)); }

        int cnt=0;
        for(int i=0; i < chars.size(); i++){
            if(findChar.equalsIgnoreCase(String.valueOf(chars.get(i)))){ cnt++; }
        }

        System.out.println(cnt);
    }

    public static boolean isEnglish(String str){
        if(!Pattern.matches("^[a-zA-z]*$", str)){
            return false;
        }else {
            return true;
        }
       }
    }
}*/

/* 답안
  class Main{
       //none-static 방식으로 메소드 생성
       public int solution(String str, char t){
           int answer = 0;
           str = str.toUpperCase();
           t = Character.toUpperCase(t);

           // 문자열 => 문자 배열
           for(char x : str.toCharArray()){ if( x==t ) answer++; }
           return answer;
       }

       public static void main(String[] args){
           //none-static 방식으로 메소드를 생성했기 때문에 Main 객체 생성이 필요
           Main T = new Main();
           Scanner kb = new Scanner(System.in);
           String str = kb.next();
           char c = kb.next().charAt(0);
           System.out.println(T.solution(str, c));
       }
 }
*/

