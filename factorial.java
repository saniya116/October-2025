import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        System.out.println("Factorial of " + n + " = " + fact);
    }
}

output:
Enter a  number : 5
Factorial of 5=120
