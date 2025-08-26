
/*
Floor and Ceil of Integer Division

comments
Given two integers a and b (where b ≠ 0). The objective is to find:
• The floor of the division a / b, denoted as ⌊a / b⌋ — the greatest integer less than or equal to a / b.
• The ceil of the division a / b, denoted as ⌈a / b⌉ — the smallest integer greater than or equal to a / b.
Input: a = 5, b = 3
Output: [1, 2]
Explanation: 5 / 3 = 1.66..., so floor is 1 and ceil is 2.

Input: a = -7, b = 2
Output: [-4, -3]
Explanation: -7 / 2 = -3.5, so floor is -4 and ceil is -3.

Table of Content

[Approach 1] Using Standard Division with Sign Correction O(1) Time and O(1) Space
[Approach 2] Using built-in functions O(1) Time and O(1) Space

[Approach 1] Using Standard Division with Sign Correction O(1) Time and O(1) Space
This code computes the floor and ceil of integer division a / b using only integer arithmetic. It first performs standard division and then adjusts the result based on the signs of a and b and whether the division is exact, ensuring correctness even for negative numbers.


import java.util.ArrayList;

class GfG {

    // Function to compute floor of a / b
    public static int floorDiv(int a, int b) {
        int q = a / b;

        // adjust down if signs differ and not divisible
        if ((a ^ b) < 0 && a % b != 0) {
            q--;
        }
        return q;
    }

    // Function to compute ceil of a / b
    public static int ceilDiv(int a, int b) {
        int q = a / b;

        // adjust up if signs same and not divisible
        if ((a ^ b) > 0 && a % b != 0) {
            q++;
        }
        return q;
    }

    // Function to return both floor and ceil in an ArrayList
    public static ArrayList<Integer> divFloorCeil(int a, int b) {
        ArrayList<Integer> res = new ArrayList<>();

        res.add(floorDiv(a, b));
        res.add(ceilDiv(a, b));

        return res;
    }

    public static void main(String[] args) {
        int a = -7, b = 2;

        ArrayList<Integer> res = divFloorCeil(a, b);
        System.out.println(res.get(0) + " " + res.get(1));
    }
}
    

[Approach 2] Using built-in functions O(1) Time and O(1) Space
Use built-in math functions (floor and ceil) to directly compute the greatest integer ≤ a/b and the smallest integer ≥ a/b, ensuring correct rounding behavior for both positive and negative values.




// Function to compute and 
// return both floor and ceil of a / b
function divFloorCeil(a, b) {
    
    // Use built-in Math.floor and Math.ceil
    let floorVal = Math.floor(a / b);
    let ceilVal = Math.ceil(a / b);

    // Return result as array
    return [floorVal, ceilVal];
}


// Driver Code
let a = -7, b = 2;
let res = divFloorCeil(a, b);
console.log(res[0], res[1]);

*/
