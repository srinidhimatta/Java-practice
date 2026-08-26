class Solution {
    public int convertFive(int n) {
        // code here
        String maha=Integer.toString(n);
        String replaced=maha.replace('0','5');
        
        return Integer.parseInt(replaced);
    }
}