import java.util.*;
public class matrix_multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat_1 = new int[row][col];
        int[][] mat_2 = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat_1[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat_2[i][j] = sc.nextInt();
            }
        }
        int[][] ans = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++) {
                ans[i][j] = 0;
                for(int k=0; k<row; k++){
                    ans[i][j] += mat_1[i][k] * mat_2[k][j];
                }
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
