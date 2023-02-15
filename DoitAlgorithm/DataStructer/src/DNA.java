import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DNA {
    static int s,p,cnt=0;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        s = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String input = st.nextToken();

        st = new StringTokenizer(br.readLine());
        arr = new int[s];

        for (int i=0; i<4; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lt = 0;
        int rt = p;
        int len = input.length()+1;
        while (rt < len){
            int[] dna = getArr(input.substring(lt++,rt++));
            if(checkArr(dna)) cnt++;
        }
        System.out.println(cnt);
    }

    public static int[] getArr(String str){
        int[] arr = new int[4];
        for (char x : str.toCharArray()){
            switch (x){
                case 'A':
                    arr[0]++; break;
                case 'C':
                    arr[1]++; break;
                case 'G':
                    arr[2]++; break;
                case 'T':
                    arr[3]++; break;
            }
        }
        return arr;
    }

    public static boolean checkArr(int[] b){
        boolean flag = true;
        for (int i=0; i < 4; i++) {
            if (arr[i] > b[i]) flag = false;
        }
        return flag;
    }
}