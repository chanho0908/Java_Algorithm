import java.util.ArrayList;
import java.util.Scanner;

/*
    6. 뒤집은 소수
    설명

    N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

    예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

    첫 자리부터의 연속된 0은 무시한다.


    입력
    첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.

    각 자연수의 크기는 100,000를 넘지 않는다.


    출력
    첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.

 */
public class ReversePrimeNum {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++) arr.add(sc.nextInt());

        for(int x : solution(arr)){
            System.out.println(x + " ");
        }

    }

    public static boolean isPrimeNumber(int n){
        if(n < 2) return false;

        for(int i=2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    // 반복문
    public static ArrayList<Integer> solution(ArrayList<Integer> arr) {
        ArrayList<Integer> rs = new ArrayList<>();

        for (int i=0; i < arr.size(); i++){
            int tmp = 0;
            int n = arr.get(i);
            while (n > 0) {
                int digit = n % 10;
                tmp = tmp * 10 + digit;
                n /= 10; // 마지막 숫자를 반환
            }
            if(isPrimeNumber(tmp)) rs.add(tmp);
        }
        return rs;
    }
    // 32 55 62 20 250 370 200 30 100
    // 23 2 73 2 3
}
