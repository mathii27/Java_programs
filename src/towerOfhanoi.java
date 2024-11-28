import java.util.*;
public class towerOfhanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        towerOfhanoii(a,'1','2','3');
    }
    public static void towerOfhanoii(int a, char first, char second, char third){
        if( a == 0 ){
            return;
        }
        towerOfhanoii(a-1,first,second,third);
        System.out.println("Move disk"+a +"from"+first+"to"+third);
        towerOfhanoii(a-1,second,third,first);
    }
}
