import java.util.*;
public class remove_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        for(int i=0; i<a; i++){
            int num = sc.nextInt();
            if(!lst.contains(num)){
                lst.add(num);
            }
        }
        System.out.println(lst);
        HashSet<Integer> sets = new HashSet<>(lst);
        System.out.println(sets);
    }
}
