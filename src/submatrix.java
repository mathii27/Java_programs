import java.util.*;
public class submatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(countSquares(matrix));
    }
    public static int countSquares(int[][] matrix) {
        int r= matrix.length;
        int c = matrix[0].length;
        int count = 0;
        int len = r>=c ? c:r;
        int k=1;
        while(k<=len){
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    count+=ans(matrix,k,i,j);
                }
            }
            k+=1;
        }
        return count;
    }
    public static int ans(int[][] mat,int n, int r, int c){
        int row = mat.length;
        int col = mat[0].length;
        int[][] mat2 = new int[n][n];
        int flag = 0;
        int m = 0, d=0, e=0;
        for(int i=r; i<r+n; i++){
            e=0;
            if(i > row-1){
                flag = 1;
                break;
            }
            for(int j=c; j<c+n; j++){
                if(j > col-1){
                    flag = 1;
                    break;
                }
                mat2[d][e] = mat[i][j];
                e+=1;
            }
            d+=1;
        }
        if(flag == 0){
            m = count(mat2,n);
        }
        return m;
    }
    public static int count(int[][] mat,int n){
        int count = 0;
        int flag = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 1){
                    flag =1;
                }
                else{
                    flag = 0;
                    count = 0;
                    break;
                }
            }
            if(flag == 0){
                break;
            }
        }
        if(flag == 1){
            //printt(mat,n);
            count+=1;
            //System.out.println("count: "+count);
        }
        return count;
    }
    public static void printt(int[][] mat,int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/* OPTIMIZED CODE: 4ms
class Solution {
     public int countSquares(int[][] matrix) {
        int rowSize  = matrix.length;
        int colSize = matrix[0].length;

        for(int i = 1; i < rowSize; i++)
        {
            for(int j = 1; j < colSize; j++)
            {
                if(matrix[i][j] == 1)
                    matrix[i][j] += Math.min(matrix[i - 1][j], Math.min(matrix[i - 1][j - 1], matrix[i][j - 1]));
            }
        }

        int total = 0;
        for(int i = 0; i < rowSize; i++)
        {
            for(int j = 0; j < colSize; j++)
            {
                total += matrix[i][j];
            }
        }

        return total;
    }
}
 */

/*
input 1:
3
4
0 1 1 1
1 1 1 1
0 1 1 1

inpput 2:
3
3
1 0 1
1 1 0
1 1 0
 */

