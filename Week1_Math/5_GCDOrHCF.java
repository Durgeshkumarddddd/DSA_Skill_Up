/*Program to Find GCD or HCF of Two Numbers

comments
Given two positive integers a and b, the task is to find the GCD of the two numbers.

Note: The GCD (Greatest Common Divisor) or HCF (Highest Common Factor) of two numbers is the largest number that divides both of them. 

Examples:

Input: a = 20, b = 28
Output: 4
Explanation: The factors of 20 are 1, 2, 4, 5, 10 and 20. The factors of 28 are 1, 2, 4, 7, 14 and 28. Among these factors, 1, 2 and 4 are the common factors of both 20 and 28. The greatest among the common factors is 4.

Input: a = 60, b = 36
Output: 12
Explanation: GCD of  60 and 36 is 12.

[Approach - 1] Using Loop - O(min(a, b)) Time and O(1) Space
The idea is to find the minimum of the two numbers and find its highest factor which is also a factor of the other number. 

class GFG {

    static int gcd(int a, int b)
    {
        // Find Minimum of a and b
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }

        // Return gcd of a and b
        return result;
    }

    public static void main(String[] args)
    {
        int a = 20, b = 28;
        System.out.print(gcd(a, b));
    }
}
    
[Approach - 2] Euclidean Algorithm using Subtraction - O(min(a,b)) Time and O(min(a,b)) Space
The idea of this algorithm is, the GCD of two numbers doesn't change if the smaller number is subtracted from the bigger number. This is the Euclidean algorithm by subtraction. It is a process of repeat subtraction, carrying the result forward each time until the result is equal to any one number being subtracted.

Pseudo-code:

gcd(a, b):
    if a = b:
        return a
    if a > b:
        return gcd(a - b, b)
    else:
        return gcd(a, b - a)

code : 
class GfG {

    static int gcd(int a, int b) {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }

    public static void main(String[] args) {
        int a = 20, b = 28;
        System.out.println(gcd(a, b));
    }
}        

[Approach - 3 ] Modified Euclidean Algorithm using Subtraction by Checking Divisibility - O(min(a, b)) Time and O(min(a, b)) Space
The above method can be optimized based on the following idea:

If we notice the previous approach, we can see at some point, one number becomes a factor of the other so instead of repeatedly subtracting till both become equal, we can check if it is a factor of the other.        

Illustration:

See the below illustration for a better understanding:

Consider a = 98 and b = 56

a = 98, b = 56:

a > b so put a = a-b and b remains same. So  a = 98-56 = 42  & b= 56. 
a = 42, b = 56:

Since b > a, we check if b%a=0. Since answer is no, we proceed further. 
Now b>a. So b = b-a and a remains same. So b = 56-42 = 14 & a= 42. 
a = 42, b = 14:

Since a>b, we check if a%b=0. Now the answer is yes. 
So we print smaller among a and b as H.C.F . i.e. 42 is  3 times of 14.
So HCF is 14. 

class GfG {

    static int gcd(int a, int b) {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Base case
        if (a == b)
            return a;

        // a is greater
        if (a > b) {
            if (a % b == 0)
                return b;
            return gcd(a - b, b);
        }

        // b is greater
        if (b % a == 0)
            return a;
        return gcd(a, b - a);
    }

    // Driver code
    public static void main(String[] args) {
        int a = 20, b = 28;
        System.out.println(gcd(a, b));
    }
}


[Approach - 4] Optimized Euclidean Algorithm by Checking Remainder
Instead of the Euclidean algorithm by subtraction, a better approach can be used. We don't perform subtraction here. we continuously divide the bigger number by the smaller number. More can be learned about this efficient solution by using the modulo operator in Euclidean algorithm.

class GfG {

    // Recursive function to calculate GCD using Euclidean algorithm
    static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    // Driver code
    public static void main(String[] args) {
        int a = 20, b = 28;
        System.out.println(gcd(a, b)); 
    }
}

*/
class GCDOrHCF {

}
