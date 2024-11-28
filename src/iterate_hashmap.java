import java.util.*;
public class iterate_hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<a; i++){
            String s = sc.next();
            int num = sc.nextInt();
            map.put(s,num);
        }
        for(Map.Entry<String, Integer> k : map.entrySet()){
            System.out.println(k.getKey()+"-"+k.getValue());
        }
    }
}
/*5
mathi 1
girish 2
musta 4
arun 5
ssss 6*/