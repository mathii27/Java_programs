import java.util.*;
public class two_dimen_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        int i=0,j=c-1;
        while(i<r && j>0){
            mat[i][j] = 0;
            mat[j][i] = 0;
            i++;
            j--;
        }

        for(int i1=0; i1<r; i1++){
            for(int j1=0; j1<c; j1++){
                if(i1==j1){
                    mat[i1][j1] = 0;
                }
                System.out.print(mat[i1][j1]+" ");
            }
            System.out.println();
        }
    }
}
