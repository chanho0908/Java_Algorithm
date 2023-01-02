import java.util.Scanner;

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