import java.util.ArrayList;
import java.util.Scanner;


public class Pizza {
    static int n,m, answer = 0;
    static int[] cm;
    static ArrayList<Point> home, pizza;

    public static void DFS(int L, int s){
        if (L == m){
            for (int x : cm) System.out.print(x + " ");
            System.out.println();
        }else {
            for (int i=s; i<pizza.size(); i++){
                cm[L] = i;
                DFS(L+1, i+1);

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        home = new ArrayList<>();
        pizza = new ArrayList<>();
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                int input = sc.nextInt();
                if (input == 1) home.add(new Point(i, j));
                else if (input == 2) pizza.add(new Point(i,j));
            }
        }

        cm = new int[m];
        DFS(0,0);

    }

}
