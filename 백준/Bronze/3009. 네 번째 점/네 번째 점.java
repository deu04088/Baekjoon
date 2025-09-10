import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int [3];
        int[] y = new int [3];

        for(int i = 0; i < x.length; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int re_x = x[0] ^ x[1] ^ x[2];
        int re_y = y[0] ^ y[1] ^ y[2];

        System.out.println(re_x +" " + re_y);
    }
}