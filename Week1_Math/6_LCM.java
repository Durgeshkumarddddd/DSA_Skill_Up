/*
 * Program to find LCM of two numbers

comments
Given two positive integers a and b. Find the Least Common Multiple (LCM) of a and b.
LCM of two numbers is the smallest number which can be divided by both numbers. 

Input :  a = 10, b = 5
Output :  10
Explanation : 10 is the smallest number divisible by both 10 and 5

Input :  a = 5, b = 11
Output :  55
Explanation : 55 is the smallest number divisible by both 5 and 11

Table of Content

[Naive Approach] Using Conditional Loop
[Expected Approach] Using GCD LCM Formula

[Naive Approach] Using Conditional Loop
This approach to calculating the Least Common Multiple (LCM) involves starting from the greater of the two numbers and checking if it's divisible by the smaller number. It iterates through multiples of the larger number, incrementing by the larger number itself in each step. The first multiple that is divisible by the smaller number is the LCM. This method is simple and intuitive, but it can be inefficient, especially for large numbers, as it checks multiple values until a match is found.
 
class GfG {

    static int lcm(int a, int b) {
        
        // Larger value
        int g = Math.max(a, b); 
        
        // Smaller value
        int s = Math.min(a, b);

        for (int i = g; i <= a * b; i += g) {
            if (i % s == 0)
                return i;
        }
        return a * b; 
    }
    
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(lcm(a, b)); 
    }
}
Time Complexity: O(min(a,b))
Auxiliary Space: O(1)
    


[Expected Approach] Using GCD LCM Formula

An efficient solution is based on the below formula for LCM of two numbers 'a' and 'b'. 

   a x b = LCM(a, b) * GCD (a, b)

   LCM(a, b) = (a x b) / GCD(a, b)

class GfG {
    
    // function for gcd 
    static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(lcm(a, b)); 
    }
}
    
Time Complexity: O(log(min(a,b))
Auxiliary Space: O(log(min(a,b))
*/

class LCM {

}
