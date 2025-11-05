package com.adeel.Questions.Array;
// Matrix Diagonal Sum
// Tricky
public class Q_Array15 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        int sum = 0;

        // Loop through each row using a single loop for (int i = 0; i < n; i++),
        // since in a square matrix both diagonals can be accessed using row index i.
        for (int i = 0; i < mat.length; i++) {
            // Add primary  diagonal element
            sum = sum + mat[i][i];

            // Add secondary diagonal element
            if(i != mat.length - 1 - i){ // avoid double-counting the center in odd-sized matrix
                sum = sum + mat[i][mat.length - 1 - i];
            }
        }

        return sum;
    }
}

/*
Primary diagonal → mat[0][0], mat[1][1], mat[2][2]
Secondary diagonal → mat[0][2], mat[1][1], mat[2][0]

for (int i = 0; i < n; i++)
👉 Loop through each row index i.
Since the matrix is square, rows and columns are both 0 → n-1.

sum += mat[i][i];
👉 This adds the primary diagonal element.
For a 3×3 matrix:

mat[0][0] → top-left
mat[1][1] → center
mat[2][2] → bottom-right

if (i != n - 1 - i)
👉 This condition avoids double-counting the middle element when n is odd.

For example:
In a 3×3 matrix, the center element is at mat[1][1].
Here, i = 1 and n - 1 - i = 1 → same position → skip it once.

sum += mat[i][n - 1 - i];
👉 Adds the secondary diagonal element.
That means:
mat[0][2] → top-right
mat[1][1] → center (skip if already counted)
mat[2][0] → bottom-left

return sum;

👉 Return the total of both diagonals.
 */