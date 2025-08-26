/*
Input: n = 12
Output: "1100"
Explanation: the binary representation of 12 is "1100", since 12 = 1×23 + 1×22 + 0×21+ 0×20 = 12

Input: n = 33
Output: "100001"
Explanation: the binary representation of 33 is "100001", since  1×25 + 0×24 + 0×23 + 0×22 + 0×21 + 1×20  = 33

Table of Content

[Approach - 1] Division by 2 - O(log₂(n)) Time and O(log₂(n)) Space
[Approach - 2] Using Head Recursion - O(log₂(n)) Time and O(log₂(n)) Space
[Approach - 3] Using Bitwise Operators - O(log₂(n)) Time and O(log₂(n)) Space
[Approach - 4] Using Built-in Methods - O(log₂(n)) Time and O(log₂(n)) Space

*/


/*
 * 
 * [Approach - 1] Division by 2 - O(log₂(n)) Time and O(log₂(n)) Space
   To convert a decimal number to binary, repeatedly divide it by 2 and record the remainders. Reading these remainders in reverse gives the binary representation.
 */
import java.util.*;

class GfG {
    static String decToBinary(int n) {
        StringBuilder bin = new StringBuilder();

        while (n > 0) {
            int bit = n % 2;
            bin.append((char) ('0' + bit));
            n /= 2;
        }
        
        // reverse the string
        bin.reverse();
        return bin.toString();
    }
    
    public static void main(String[] args) {
        int n = 12;
        System.out.println(decToBinary(n));
    }
}