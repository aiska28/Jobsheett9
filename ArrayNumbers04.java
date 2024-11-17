import java.util.Scanner;

public class ArrayNumbers04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[4];
        num[0] = 5;
        num[1] = 12;
        num[2] = 7;
        num[3] = 20;

        // System.out.println(num[0]);
        // System.out.println(num[1]);
        // System.out.println(num[2]);
        // System.out.println(num[3]);

        // for (int i = 0; i < 4; i++) {
        //     System.out.println(num[i]);
        // }

        for (int i = 0; i <= 4; i++) {
            System.out.println(num[i]);
        }
    }
}