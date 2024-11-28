import java.util.*;
public class balance_paranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //Stack<Character> m = new Stack<>();
        Stack<Integer> num = new Stack<>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '{'){
                //m.push(s.charAt(i));
                num.push(i);
            }
            if(s.charAt(i) == '}'){
                if(!num.isEmpty()){
                    //m.pop();
                    num.pop();
                    count += 2;
                }
                else{
                    //m.push(s.charAt(i));
                    num.push(i);
                }
            }
        }
//        if(m.size() != 0){
//            System.out.println("Not balanced");
//        }
//        else{
//            System.out.println("balanced");
//        }
        System.out.println(num.peek());
        System.out.println(count-num.peek());
    }
}

