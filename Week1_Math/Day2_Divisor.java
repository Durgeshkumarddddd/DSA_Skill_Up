import java.util.Scanner;

class Divisor {
    
    public static void main(String args[]) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    num++;
                }
                if (num >= 9) {
                    count++;
                }
            }
            num = 0;
        
        }
        System.out.println("count is :" + count);
    }
}
