import java.util.*;
public class array_replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int j=0;
        if(j<6) {
            for (int i : arr) {
                i = sc.nextInt();
                arr[j] = i;
                j++;
            }
        }
        /*int num = sc.nextInt();
        int index = sc.nextInt();
        if(index > 6){
            System.out.println("cannot proceed!!");
        }
        else{
            arr[index] = num;
        }
        System.out.println("after replacement!!");
        for(int i : arr){
            System.out.print(i+" ");
        }*/
        /*System.out.println("after deletion!!");
        int[] arr2 = new int[5];
        int k = 0;
        for(int i : arr){
            arr2[k] = i;
            System.out.print(arr[k]+" ");
            k++;
        }*/
        int[] arr2 = new int[5];
        int j1=0;
        if(j1<5) {
            for (int i : arr2) {
                i = sc.nextInt();
                arr2[j1] = i;
                j1++;
            }
        }

        int length = arr.length + arr2.length;
        int[] new_arr = new int[length];
        int m=0;
        //typing.......

        for(int i=0; i<arr.length; i++){
            new_arr[m] = arr[i];
            m++;
        }
        for(int i=0; i<arr2.length; i++){
            new_arr[m] = arr2[i];
            m++;
        }


        for(int i : new_arr){
            System.out.print(i+" ");
        }
    }
}
