
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
int min = 0; // Our counting variable

for (int i = 0; i < arr.size(); i++) {
    if (arr.get(i) <= x) {
        min++; // Increase count if the element is smaller or equal to x
    }
}

return min;
      
    }
}