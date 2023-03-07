// 조합
public class Combination {
    static int[] arr, combi;
    static int r;
    public static void combination(int L, int start){
        if(L == r){
            for(int x : combi) System.out.print(x+" ");
            System.out.println();
        }else {
            for(int i=start; i <= arr.length; i++){
                combi[L] = i;
                combination(L+1, i+1);
            }
        }
    }

    public static void main(String[] args){
        arr = new int[]{1, 2, 3, 4};
        r = 2;
        combi = new int[r];
        combination(0, 1);
    }

}
