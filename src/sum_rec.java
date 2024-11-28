import java.util.*;
public class sum_rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sums = 0;
        System.out.println(sum(num,sums));
    }
    public static int sum(int num,int sums){
        if(num%10 == 0){
            return sums;
        }
        sums+=num%10;
        num = num/10;
        return sum(num,sums);
    }
}
