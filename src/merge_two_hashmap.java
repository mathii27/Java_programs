import java.util.*;
public class merge_two_hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(int i=0; i<a; i++){
            String s = sc.next();
            int num = sc.nextInt();
            map1.put(s,num);
        }

        for(int i=0; i<a; i++){
            String s = sc.next();
            int num = sc.nextInt();
            map2.put(s,num);
        }

        map1.putAll(map2);
        System.out.println();
        for(Map.Entry<String, Integer> k : map1.entrySet()){
            System.out.println(k.getKey()+"-"+k.getValue());
        }

        /*for(Map.Entry<String, Integer> k : map2.entrySet()){
            String s1 = k.getKey();
            int b = k.getValue();
            if(map1.containsKey(s1)){

            }
        }*/
    }
}
