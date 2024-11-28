import java.util.*;
public class reverse_arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        for(int i=0; i<a; i++){
            lst.add(sc.nextInt());
        }
        Collections.reverse(lst);
        System.out.println(lst);
        Iterator<Integer> itr = lst.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
