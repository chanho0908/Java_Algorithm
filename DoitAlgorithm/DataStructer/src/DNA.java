import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
    9 8
    CCTGGATTG
    2 0 1 1

 */
public class DNA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String input = st.nextToken();

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[s];
        for (int i=0; i<4; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //int[] dna = getArr(input, p);
        int lt = 0;
        int rt = p;
        while (rt != p+1){
            System.out.println(input.substring(lt,rt));
            lt++;
            rt++;
        }

        System.out.println(input.substring(lt,rt));


    }

    /*public static int[] getArr(String str, int p){
        int[] arr = new int[p];

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
    }*/

    public static boolean check(int[] a, int[] b){
        boolean flag = true;
        for (int i=0; i<4; i++){
            if (a[i] > b[i]){
                flag = false;
            }
        }
        return flag;
    }
}
