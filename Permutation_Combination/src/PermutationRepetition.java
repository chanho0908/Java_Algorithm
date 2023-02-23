// 중복 순열
public class PermutationRepetition {
    static int[] arr, pm;
    static int r;
    public static void permutation(int L){
        if(L == r){
            for(int n : pm) System.out.print(n);
            System.out.println();
            return;
        }
        for(int i=0; i<arr.length; i++){
            pm[L] = arr[i];
            permutation(L+1);
        }
    }

    public static void main(String[] args){
        arr = new int[]{1, 2, 3};
        r = 2;
        pm = new int[r];
        permutation(0);
    }
}
