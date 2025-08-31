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

