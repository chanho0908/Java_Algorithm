import java.util.Scanner;

public class TestNo12 {
    public static void main(String[] args) {
        /*
        4 3
        3 4 1 2
        4 3 2 1
        3 1 4 2
         */

        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //int m = sc.nextInt();
        int[][] arr = {{3,4,1,2}, {4,3,2,1}, {3,1,4,2}};

        int answer = 0;
        for (int i=1; i <= 4; i++){
            for (int j=1; j <= 4; j++){
                if ( i == j) break;
                int cnt = 0;
                System.out.println(j + "번째 시험에서 " + i +"번 학생의 등수");
                for (int k=0; k < 3; k++){ // 시험 횟수
                    System.out.println(i+ "번 학생");
                    int posI=0, posJ = 0;
                    for (int s=0; s < 4; s++){ // 등수

                        System.out.println("arr["+ k + "][" + s + "] == " +arr[k][s] + " and i :" + i);
                        if (arr[k][s] == i) posI = s;
                        System.out.println("posI : " + posI);
                        System.out.println("arr["+ k + "][" + s + "] == " +arr[k][s] + " and j :" + j);
                        if (arr[k][s] == j) posJ = s;

                        System.out.println("posJ : " + posJ);
                    }
                    System.out.println("##################################");
                    if(posI < posJ)
                        cnt++;
                    System.out.println("cnt: " + cnt);
                }
                if (cnt == 3) answer++;
                System.out.println("answer : " + answer );

            }
        }
        System.out.println(answer);
        //return answer;

    }
}
