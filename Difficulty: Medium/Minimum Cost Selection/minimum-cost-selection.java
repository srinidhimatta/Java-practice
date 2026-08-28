class Solution {
    public int minCost(int[][] mat) {
 int n = mat.length;

 // Track the minimum cost for each choice of the current row
 int prev0 = mat[0][0];
 int prev1 = mat[0][1];
 int prev2 = mat[0][2];

 for (int i = 1; i < n; i++) {
     // Calculate the cost for each choice based on the previous row's other choices
     int curr0 = mat[i][0] + Math.min(prev1, prev2);
     int curr1 = mat[i][1] + Math.min(prev0, prev2);
     int curr2 = mat[i][2] + Math.min(prev0, prev1);

     // Move current values to previous for the next iteration
     prev0 = curr0;
     prev1 = curr1;
     prev2 = curr2;
 }

 // Return the minimum of the three choices in the final row
 return Math.min(prev0, Math.min(prev1, prev2));
    }
}