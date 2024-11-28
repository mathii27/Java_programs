import java.util.*;
public class vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int count = 0;
        for(char ch : arr){
            ch = Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch =='u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
