import java.util.Scanner;

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