
class Solution {
    public void swapKth(List<Integer> arr, int k) {
        // code here
      int firstIndex = k - 1;
        int lastIndex = arr.size() - k;
        
        int temp = arr.get(firstIndex);
        arr.set(firstIndex, arr.get(lastIndex));
        arr.set(lastIndex, temp);
    }
}
