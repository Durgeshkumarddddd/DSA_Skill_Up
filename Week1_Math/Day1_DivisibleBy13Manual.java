/*
Input: s = "2911285"
Output: true
Explanation: 2911285 / 13 = 223945, which is a whole number with no remainder.

Input: s = "27"
Output: false
Explanation: 27 / 13 ≈ 2.0769..., which is not a whole number (there is a remainder).

--- We process the number digit by digit from left to right, maintaining the remainder modulo 13 at each step using the formula:
rem = (rem * 10 + digit) % 13.

Step by Step Approach -

Initialize remainder:
-> rem = 0
Process each digit from left to right:
-> Digit '2': rem = (0 * 10 + 2) % 13 = 2
-> Digit '9': rem = (2 * 10 + 9) % 13 = 29 % 13 = 3
-> Digit '1': rem = (3 * 10 + 1) % 13 = 31 % 13 = 5
-> Digit '1': rem = (5 * 10 + 1) % 13 = 51 % 13 = 12
-> Digit '2': rem = (12 * 10 + 2) % 13 = 122 % 13 = 5
-> Digit '8': rem = (5 * 10 + 8) % 13 = 58 % 13 = 6
-> Digit '5': rem = (6 * 10 + 5) % 13 = 65 % 13 = 0
Since final rem = 0, the number 2911285 is divisible by 13.
*/


class DivisibleBy13Manual {
    public static void main(String[] args) {
        String input = "12345678901234567890123456789012345678901234567890"; // very large number
        int divisor = 13;
        int remainder = 0;

        for (int i = 0; i < input.length(); i++) {
            remainder = (remainder * 10 + (input.charAt(i) - '0')) % divisor;
        }

        if (remainder == 0) {
            System.out.println("Divisible by 13");
        } else {
            System.out.println("Not Divisible by 13");
        }
    }
}

