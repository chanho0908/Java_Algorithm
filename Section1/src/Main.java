import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        String input = sc.next();
        System.out.println(solution(input, n));
    }
    //KKHSSSSSSSE
    public static String solution(String input, int n) {
        String str = input.replace("#", "1" ).replace("*", "0");
        ArrayList<Character> arr = new ArrayList<>();
        for (int i=0; i<input.length(); i+=7){
            arr.add((char) Integer.parseInt(str.substring(i, i+7),2));
        }

        return String.valueOf(arr);
    }
}