import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();
        
        int result = 0;
        int power = 1; // 자리값 (B^0 부터 시작)
        
        for (int i = N.length() - 1; i >= 0; i--) {
            char c = N.charAt(i);
            int value;
            
            if ('0' <= c && c <= '9') {
                value = c - '0';
            } else {
                value = c - 'A' + 10;
            }
            
            result += value * power;
            power *= B;
        }
        
        System.out.println(result);
    }
}
