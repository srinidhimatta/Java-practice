class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
   int less = 0;
   int more = 0;
   for(int i = 0; i < arr.length; i++){
       if(arr[i] <= target){
           less++;
       }
       if(arr[i] >= target){
           more++;
       }
   }
   return new int[] {less, more};
    }
}