import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("문자열 입력");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String input) {
        String answer="Yes";
        String rv = new StringBuilder(input).reverse().toString();
        if(rv.equalsIgnoreCase(input)) return answer;

        return "No";
    }
}