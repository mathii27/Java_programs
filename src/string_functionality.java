import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class string_functionality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = sc.nextLine();
        StringBuilder s2 = new StringBuilder(sc.nextLine());
        char ch = sc.next().charAt(0);
        //reader.readLine();
        int flag = 0;
        System.out.println("length of the string1 :"+s1.length());
        System.out.println("length of the string2 :"+s2.length());
        System.out.println("concat: "+s1.concat(s2.toString()));
        for(int i=0; i<s1.length(); i++){
                flag = 1;
                System.out.println("index: "+s1.indexOf(ch));
                break;

        }
        if(flag == 0){
            System.out.println("Character not found in String");
        }
        System.out.println(s1.toUpperCase());
        System.out.println((s2.toString()).toLowerCase());
        if(s1.equals(s2)){
            System.out.println("true");
        }
        else{
            System.out.println("The strings are not equal");
        }
    }
}
