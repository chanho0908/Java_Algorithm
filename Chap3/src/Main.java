import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i <= 10; i++){
            for(int j=1; j <= 10; j++){
                sum += i*j;
            }
        }
        System.out.println(sum);
    }
}