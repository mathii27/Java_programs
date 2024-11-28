import java.util.*;
public class lexico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String m = "", n = "";
        int length1 = s1.length() < s2.length() ? s1.length() : s2.length();
        for (int i = 0; i < length1; i++) {
            if ((s1.charAt(i)) - '0' < s2.charAt(i) - '0') {
                m = s1;
                n = s2;
                System.out.println(m + " " + n);
                break;
            } else if ((s1.charAt(i)) - '0' > s2.charAt(i) - '0') {
                m = s2;
                n = s1;
                System.out.println(m + " " + n);
                break;
            }
        }
        if (m.isEmpty() || n.isEmpty()) {
            String str = s1.length() < s2.length() ? s1 : s2;
            System.out.println(s1 + " " + s2);
        }
    }
}
