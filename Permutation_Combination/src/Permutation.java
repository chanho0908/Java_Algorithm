// 순열
public class Permutation {
    static int[] arr,ch, pm;
    static int r;

    public static void permutation(int L){
        if (L == r){
            for (int n : pm) System.out.print(n+" ");
            System.out.println();
            return;
        }
        for(int i=0; i < arr.length; i++){
            if(ch[i]==0){
                ch[i] = 1;
                pm[L] = arr[i];
                permutation(L+1);
                ch[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        arr = new int[]{1, 2, 3};
        r = 2;
        ch = new int[r+1];
        pm = new int[r];
        permutation(0);
    }
}
