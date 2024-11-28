import java.util.*;
public class intersection_of_two_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> lst1 = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>();
        for(int i=0; i<a; i++){
            int num = sc.nextInt();
            if(!lst1.contains(num)) {
                lst1.add(num);
            }
        }
        for(int i=0; i<a; i++){
            int num = sc.nextInt();
            if(!lst2.contains(num)) {
                lst2.add(num);
            }
        }
        int i=0;
        //int j =0;
        while(i<lst1.size()){
            if(lst2.contains(lst1.get(i))){
                System.out.print(lst1.get(i)+" ");
            }
            i++;
        }
    }
}

/*5
11 22 33 33 55
77 88 22 55 77*/