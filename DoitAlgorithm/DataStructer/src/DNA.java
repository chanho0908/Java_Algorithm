import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DNA {
    static int s,p,cnt=0;
    static int[] arr; // 최소 문자 수
    static char[] input; // 문자열
    static int[] asInt; // 문자 수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        s = Integer.parseInt(st.nextToken()); // 문자열 길이
        p = Integer.parseInt(st.nextToken());

        arr = new int[s];
        asInt = new int[4];
        input = br.readLine().toCharArray(); // 문자열

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<4; i++) arr[i] = Integer.parseInt(st.nextToken());

        for (int i=0; i<p; i++) addArr(input[i]);

        int lt = 0;
        int rt = p; // 8
        int len = input.length; // 9

        while (rt < len){
            addArr(input[rt++]);
            removeArr(input[lt++]);
            if (checkArr(asInt)) cnt++;
        }
        System.out.println(cnt);
    }

    public static void addArr(char c){
        switch (c){
            case 'A':
                asInt[0]++; break;
            case 'C':
                asInt[1]++; break;
            case 'G':
                asInt[2]++; break;
            case 'T':
                asInt[3]++; break;
        }
    }

    public static void removeArr(char c){
        switch (c){
            case 'A':
                asInt[0]--; break;
            case 'C':
                asInt[1]--; break;
            case 'G':
                asInt[2]--; break;
            case 'T':
                asInt[3]--; break;
        }
    }

    public static boolean checkArr(int[] b){
        boolean flag = true;
        for (int i=0; i < 4; i++) {
            if (arr[i] > b[i]) flag = false;
        }
        return flag;
    }
}