import java.util.ArrayList;
import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {

    }

    public static String solution(String input) {
        String answer="Yes";
        String rv = new StringBuilder(input).reverse().toString();
        if(rv.equalsIgnoreCase(input)) return answer;

        return "No";
    }
}
