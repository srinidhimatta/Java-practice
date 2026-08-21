import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
int i=1;
        int N = Integer.parseInt(bufferedReader.readLine().trim());
 while(1<N ){
        System.out.println(N + " x " + i + " = " + (N * i));
        if(i>=10){
            break;
        }
        i++;

    }
        bufferedReader.close();
    }
}
