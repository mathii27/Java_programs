import java.util.*;
public class interator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0; i<5; i++){
            lst.add(sc.nextInt());
        }
        Iterator<Integer> itr = lst.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
