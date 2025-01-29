import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // HCF (Highest Common Factor)
        int hcf = 1;
        int smaller = a < b ? a : b;  // Smallest of the two numbers
        for (int i = 1; i <= smaller; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;  // Update HCF
            }
        }

        // LCM (Lowest Common Multiple)
        int lcm = 0;
        int check = greater(a, b); // Start from the greater number
        while (true) {
            if (check % a == 0 && check % b == 0) {
                lcm = check;  // Found LCM
                break;  // Exit the loop
            }
            check++;  // Increment and check next number
        }

        // Output the results
        System.out.println("HCF: " + hcf + " LCM: " + lcm);
    }

    // Helper method to find greater number between a and b
    public static int greater(int a, int b) {
        return (a > b) ? a : b;
    }
}
