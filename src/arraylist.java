import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<>();
        int len = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<len; i++){
            lst.add(sc.nextInt());
        }
        lst.add(10);
        System.out.println(lst);
        lst.set(0,87);
        System.out.println(lst);
        lst.remove(6);
        System.out.println(lst);
        System.out.println(lst.indexOf(100));
        System.out.println(lst);
        lst.addFirst(1);
        System.out.println(lst);
        lst.addLast(99);
        System.out.println(lst);

    }
}
