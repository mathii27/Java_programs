import java.util.*;

public class practice_generics{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        Main1<Integer, String> obj = new Main1<>(number, name);
        obj.print();
    }
}
class Main1 <X,Y>{
    private X num;
    private Y name;

    Main1(X num, Y name){
        this.num = num;
        this.name = name;
    }
    public void print(){
        System.out.println(num);
        System.out.println(name);
    }

}
