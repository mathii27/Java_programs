    import java.util.*;
    public class palindrome_recur {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            if(palin(s,0,s.length()-1)){
                System.out.println("String is a palindrome");
            }
            else{
                System.out.println("String is not a palindrome");
            }
        }
        public static boolean palin(String s, int start, int end){
            if(s.charAt(start) == s.charAt(end)){
                if(start <s.length()/2 && end>s.length()/2) {
                    palin(s, start+1, end-1);
                }
            }
            else{
                return false;
            }
            return true;
        }
    }
