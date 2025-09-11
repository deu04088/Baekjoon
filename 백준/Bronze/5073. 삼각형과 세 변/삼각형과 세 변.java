import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if(A == 0 && B == 0 && C == 0){
                break;
            }

            if(A+B <= C || B+C <= A || C+A <= B){
                System.out.println("Invalid");
            }
            else if(A == B && B == C && C == A) {
                System.out.println("Equilateral");
            }
            else if(A == B || B == C || C == A) {
                System.out.println("Isosceles");
            }
            else {
                System.out.println("Scalene");
            }
        }
    }
}
