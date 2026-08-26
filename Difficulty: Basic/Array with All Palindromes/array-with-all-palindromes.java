class Solution {
    public static boolean isPalinArray(int[] arr) {
for (int i = 0; i < arr.length; i++) {
    int num = arr[i];
    int original = num;
    int reversed = 0;

    // Reverse the individual number
    while (num > 0) {
        int digit = num % 10;
        reversed = (reversed * 10) + digit;
        num = num / 10;
    }

    // If even ONE number is not a palindrome, return false immediately
    if (original != reversed) {
        return false;
    }
}

// If all numbers passed the test, the array is valid!
return true;
    }
}