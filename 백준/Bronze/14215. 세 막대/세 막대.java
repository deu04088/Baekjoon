import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max = Math.max(A,Math.max(B,C));
        int temp = A+B+C - max;
        int result = 0;

        if (max >= temp) {
            max = temp -1;
            result = max + temp;
        }
        else {
            result = max + temp;
        }
        System.out.println(result);
    }
}