/*
    while (n > 0){
        int digit = n % 10;            1. 숫자의 맨 뒷자리 ! => 12345.6 => 6
        result = result * 10 + digit;  2. 0 = 0 * 10 + 6 => result = 6
        n /= 10;                       3. 마지막 숫자를 제외한 나머지 ! => 12345.6 => 12345
        System.out.println("result : " + result);
    }

 */

public class ReserveInt {
    public static void main(String[] args) {
        int n = 123456; // 뒤집을 숫자
        int result = 0; // 결과

        while (n > 0){
            int digit = n % 10;
            result = result * 10 + digit; // 10의 자릿수를 늘림
            n /= 10;
            //System.out.println("result : " + result);
        }
        System.out.println(result);
    }
}
