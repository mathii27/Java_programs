import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<a; i++){
            int index = mini(arr,i,a);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static int mini(int[] arr,int b, int size){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i=b; i<size; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
