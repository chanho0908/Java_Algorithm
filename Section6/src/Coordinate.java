import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
    public int x,y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p){
        if (this.x == p.x) return this.y - p.y;
        else return this.x - p.x;

    }
}

public class Coordinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x,y));
        }
        Collections.sort(arr);
        for (Point p : arr) System.out.println(p.x + " " + p.y);
    }
    // 5
    // 2 7
    // 1 3
    // 1 2
    // 2 5
    // 3 6

}
