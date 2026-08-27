class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        
        return str.toString();
    }
}