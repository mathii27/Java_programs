import java.util.*;
public class shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        for(int i=0; i<a; i++){
            lst.add(sc.nextInt());
        }
        Collections.shuffle(lst);
        System.out.println(lst);
    }
}
