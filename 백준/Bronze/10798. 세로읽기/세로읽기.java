import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];
        int maxLen = 0;

        for(int i = 0; i < 5; i++){
            words[i] = sc.nextLine();
            if(words[i].length() > maxLen)
                maxLen = words[i].length();
        }

        for(int i = 0; i < maxLen; i++){
            for(int j = 0; j < 5; j++){
                if(i < words[j].length())
                    System.out.print(words[j].charAt(i));
            }
        }
    }
}
