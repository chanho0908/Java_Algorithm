import java.util.HashMap;
import java.util.Scanner;

/*
    2. 아나그램(해쉬)
    설명

    Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.

    예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로

    알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.

    길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.


    입력
    첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력됩니다.

    단어의 길이는 100을 넘지 않습니다.


    출력
    두 단어가 아나그램이면 “YES"를 출력하고, 아니면 ”NO"를 출력합니다.

 */
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(solution(str1, str2));
    }
    //AbaAeCe
    //baeeACA
    public static String solution(String str1, String str2){

        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : str1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : str2.toCharArray()){
            if (!map.containsKey(x) || map.get(x) == 0){
                return "NO";
            }
            map.put(x, map.get(x)-1);
        }
        return "YES";
    }
    /*
        AbaAeCe
        >> A(2) b(1) a(1) C(1) e(2)

        반복문을 타게 되면

        baeeACA

        1 : b
         A(2) b(1) a(1) C(1) e(2)
         >> b 1개 감소
         A(2) b(0) a(1) C(1) e(2)

        2 : a
         A(2) b(0) a(1) C(1) e(2)
         >> a 1개 감소
         A(2) b(0) a(0) C(1) e(2)

        3,4 : e, e
         A(2) b(0) a(0) C(1) e(2)
         >> e 2개 감소
         A(2) b(0) a(0) C(1) e(0)

        5 : A
         A(2) b(0) a(0) C(1) e(0)
         >> A 1개 감소
         A(1) b(0) a(0) C(1) e(0)

        6 : C
         A(2) b(0) a(0) C(1) e(0)
         >> C 1개 감소
         A(1) b(0) a(1) C(0) e(0)

        7 : A
         A(2) b(0) a(0) C(1) e(0)
         >> A 1개 감소
         A(0) b(0) a(0) C(0) e(0)

         반복문이 끝났을 때 map value 값이 모두 0이면 YES
     */

}
