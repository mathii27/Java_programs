import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0; i<a; i++){
            lst.add(sc.nextInt());
        }
        int i=0;
        while(!lst.isEmpty()){
            int curr = lst.get(0);
            int count = 0;
            for(int j=0; j<lst.size(); j++){
                if(curr == lst.get(j)){
                    count++;
                }
            }
            System.out.println(curr+" "+count);
            lst.removeIf(n -> n == curr);
        }
    }
}

/*7
1 2 3 9 4 2 5*/