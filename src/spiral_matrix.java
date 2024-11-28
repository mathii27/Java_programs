import java.util.*;
public class spiral_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for(int i=0; i<r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        while(top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }
}

/*
5
5
1 2 3 4 5
6 7 8 9 1
9 8 7 6 5
3 4 5 6 7
7 6 5 4 3
 */