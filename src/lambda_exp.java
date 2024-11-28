import java.util.*;
public class lambda_exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0; i<a; i++){
            lst.add(sc.nextInt());
        }
        lst.removeIf(n->n == 6);
        lst.forEach(num -> System.out.print(num+" "));
    }
}
