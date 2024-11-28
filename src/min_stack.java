//9-10-2024
import java.util.*;
public class min_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for(int i=0; i<a; i++){
            st1.push(sc.nextInt());
        }
        int mini = min(st1,a,st2);
        int flag = 0;
        while(st2.size() != 0){
            if(st2.pop() == mini){
                flag = 1;
                break;
            }
        }
        System.out.println("The numbers are: ");
        while(st2.size() != 0){
            System.out.println(st2.pop());
        }
    }
    public static int min(Stack<Integer> st1, int a, Stack<Integer> st2){
        int min = Integer.MAX_VALUE;
        int i=0;
        while(i<a){
            int num = st1.pop();
            if(num < min) {
                min = num;
            }
            st2.push(num);
            i++;
        }
        return min;
    }
}
