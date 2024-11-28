import java.util.*;
public class sort_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < a; i++) {
            st.push(sc.nextInt());
        }
        sort(st);
        System.out.println(st);
    }

    public static void sort(Stack<Integer> st){
       if(st.isEmpty()){
           return;
       }
       int num = st.pop();
       sort(st);
       insert(st,num);
    }

    public static void insert(Stack<Integer> st, int num){
        if(st.isEmpty() || num > st.peek()){
            st.push(num);
            return;
        }
        int number = st.pop();
        insert(st,num);
        st.push(number);
    }
}
