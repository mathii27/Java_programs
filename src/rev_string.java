import java.util.*;
public class rev_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(rev(s,s.length()-1));
    }
    public static char rev(String s, int end){
        if(end < 0){
            return 0;
        }
        System.out.print(s.charAt(end));

        return rev(s,end-1);
    }

}
