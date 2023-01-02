import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("문자열 입력");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution(input));
    }

    public static String solution(String input) {
        String[] words = input.split(" "); //공백으로 구분
        int max = 0;
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max) { // 단어가 더 길면 max가 바뀜
                max = words[i].length();
                index = i;
            }
        }
        return words[index];
    }
}