import java.util.*;
public class leading_zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != '0'){
                index = i;
                break;
            }
        }
        System.out.println(str.substring(index));
    }
}
