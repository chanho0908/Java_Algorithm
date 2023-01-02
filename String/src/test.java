import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
            String str ="abcd";
            ArrayList<String> result = new ArrayList<>();
            char[] c = str.toCharArray();

            int lt = 0, rt = c.length-1;
            while (lt < rt){
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            System.out.println(c);


        }

}
