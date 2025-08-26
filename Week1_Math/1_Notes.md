===========================================
Short Notes: Maths & Combinatorics
===========================================

1) Mathematical Foundations
-------------------------------------------
These are the most basic but essential mathematical tools in programming.
They help in performing quick checks, optimizing loops, and building logic for number-based problems.
Understanding GCD, LCM, floor/ceil, and number properties like parity or binary form is fundamental.

-------------------------------------------
2) Even & Odd Check
-------------------------------------------
- A number is even if it is divisible by 2:
    n % 2 == 0
- Otherwise, it is odd.

-------------------------------------------
3) Floor & Ceil
-------------------------------------------
- Floor: Greatest integer less than or equal to the number
    Example: floor(3.8) = 3
- Ceil: Smallest integer greater than or equal to the number
    Example: ceil(3.2) = 4

-------------------------------------------
4) Sum of First n Natural Numbers
-------------------------------------------
    Sum = n(n + 1) / 2

-------------------------------------------
5) GCD (Greatest Common Divisor)
-------------------------------------------
- Largest number that divides both a and b.
- Euclidean Algorithm:
    gcd(a, b) = gcd(b, a % b)

-------------------------------------------
6) LCM (Least Common Multiple)
-------------------------------------------
- Smallest number divisible by both a and b.
- Formula:
    lcm(a, b) = (a × b) / gcd(a, b)

-------------------------------------------
7) Perfect Number
-------------------------------------------
- A number is perfect if it equals the sum of its proper divisors.
    Example: 6 → divisors: 1, 2, 3 → sum = 6

-------------------------------------------
8) Finding Factors
-------------------------------------------
- Iterate from 1 to √n and check:
    if (n % i == 0) → store i and n/i

-------------------------------------------
9) Decimal to Binary Conversion
-------------------------------------------
- Divide number by 2 repeatedly, store remainders, reverse them.

-------------------------------------------
10) Prime Number Algorithms and Sieve Techniques
-------------------------------------------
- A prime number is greater than 1 and has exactly two divisors: 1 and itself.

Basic Primality Check:
    - Divide n by numbers from 2 to n-1.
    - If any number divides n → Not Prime; else Prime.

Optimized Method (Square Root Check):
    - Only check up to √n.
    - If no number from 2 to √n divides n → Prime.



class GfG {
    static int[] sieve(int n) {
              // creation of boolean array
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }
 
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                // marking as false
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
 
        // Count number of primes
        int count = 0;
        for (int p = 2; p <= n; p++) {
            if (prime[p])
                count++;
        }
 
        // Store primes in an array
        int[] res = new int[count];
        int index = 0;
        for (int p = 2; p <= n; p++) {
            if (prime[p])
                res[index++] = p;
        }
 
        return res;
    }
 
    public static void main(String[] args) {
        int n = 35;
        int[] res = sieve(n);
        for (int ele : res) {
            System.out.print(ele + " ");
        }
    }



=================================================
Prime Factorization & Modular Arithmetic Notes
=================================================

Example Output:
2 3 5 7 11 13 17 19 23 29 31

=================================================
1) Prime Factorization Techniques
=================================================

-----------------------------------------------
Optimized Trial Division
-----------------------------------------------
- Try dividing n by all numbers up to √n, starting from 2.
- After removing all factors of 2, check only odd numbers.
- If n is still greater than 1, it's a prime factor itself.

-----------------------------------------------
Using Sieve + SPF (Smallest Prime Factor)
-----------------------------------------------
- The sieve precomputes and stores the smallest prime factor (SPF) for every number up to n.
- To factorize any number:
    1. Look up spf[n].
    2. Divide n by it, collect the prime factors.
- This method allows counting prime factors efficiently.

-----------------------------------------------
Number of Divisors from Prime Factorization
-----------------------------------------------
If n = p1^e1 × p2^e2 × ... × pk^ek

Then:
Total divisors = (e1 + 1) × (e2 + 1) × ... × (ek + 1)

Reason:
Each exponent ei gives (ei + 1) choices (from pi^0 to pi^ei).
Multiply all choices to get the total number of divisors.

=================================================
2) Modular Arithmetic
=================================================
Modular arithmetic is a system where numbers wrap around after reaching a certain value (modulus).
Used in programming, cryptography, and number theory.

-----------------------------------------------
Basic Definition
-----------------------------------------------
a % m = remainder when a is divided by m

-----------------------------------------------
Modular Addition
-----------------------------------------------
(a + b) % m = [(a % m) + (b % m)] % m

-----------------------------------------------
Modular Subtraction
-----------------------------------------------
(a - b) % m = [(a % m) - (b % m) + m] % m
(Add m to avoid negative results)

-----------------------------------------------
Modular Multiplication
-----------------------------------------------
(a × b) % m = [(a % m) × (b % m)] % m

-----------------------------------------------
Modular Division
-----------------------------------------------
We cannot divide directly under modulo.
To divide a by b under modulo m:
(a / b) % m = (a × b^-1) % m
Where b^-1 is modular inverse of b (mod m).

-----------------------------------------------
Modular Inverse (Fermat's Little Theorem)
-----------------------------------------------
If gcd(b, m) = 1 and m is prime:
b^-1 ≡ b^(m-2) % m
Use modular exponentiation to compute b^(m-2) % m.

=================================================
3) Binary Exponentiation (Fast Power Mod)
=================================================
Compute a^b % m efficiently in O(log b) time.
Instead of multiplying a b times, break power into squares:
a^b = a^(1) × a^(2) × a^(4) × ...
Include terms where bit in b is 1.

-----------------------------------------------
Java Implementation:
-----------------------------------------------
class GfG {
    public int powMod(int x, int n, int M) {
        int res = 1;

        while (n >= 1) {
            if ((n & 1) == 1) { // n is odd
                res = (res * x) % M;
                n--;
            } else { // n is even
                x = (x * x) % M;
                n /= 2;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int x = 3, n = 2, M = 4;
        GfG obj = new GfG();
        System.out.println(obj.powMod(x, n, M));
    }
}

Output:
1

=================================================
4) Euler's Totient Function & Inclusion-Exclusion
=================================================

-----------------------------------------------
Euler's Totient Function φ(n)
-----------------------------------------------
Counts numbers ≤ n that are coprime to n.

If n = p1^e1 × p2^e2 × ... × pk^ek
φ(n) = n × (1 - 1/p1) × (1 - 1/p2) × ... × (1 - 1/pk)

-----------------------------------------------
Inclusion-Exclusion Principle (IEP)
-----------------------------------------------
Used to count elements in union of overlapping sets.

General Formula:
|A1 ∪ A2 ∪ ... ∪ An| = ∑|Ai| - ∑|Ai∩Aj| + ∑|Ai∩Aj∩Ak| - ... + (-1)^(n+1)|A1∩A2∩...∩An|

Example for 3 sets (A, B, C):
|A ∪ B ∪ C| = |A| + |B| + |C| - |A∩B| - |B∩C| - |A∩C| + |A∩B∩C|


