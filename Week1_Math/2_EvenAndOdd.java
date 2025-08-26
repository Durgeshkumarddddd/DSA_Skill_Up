// Table of Content To Check Even and Odd a number 

// [Naive Approach] By Finding the Remainder - O(1) Time and O(1) Space
// [Efficient Approach] Using Bitwise AND Operator - O(1) Time and O(1) Space

// Naive approach

class CheckEvenOdd {

    public static boolean isEven(int n) {
        // finding remainder of n
        int rem = n % 2;
        if (rem == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int n = 15;
        if (isEven(n) == true)
            System.out.print("true");
        else
            System.out.print("false");
    }
}


// Efficient Approach  
// The last bit of all odd numbers is always 1, while for even numbers it’s 0. So, when performing bitwise AND operation with 1, odd numbers give 1, and even numbers give 0.


class GfG {
    public static boolean isEven(int n)
    {
        // taking bitwise and of n with 1 
        if ((n & 1) == 0)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args)
    {
        int n = 15;
        if (isEven(n) == true)
            System.out.print("true");
        else
            System.out.print("false");
    }
}

