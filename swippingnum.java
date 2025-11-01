import java.util.Scanner;
class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("\nBefore swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
       System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

output:
Enter first number:5
Enter second number:10

Before swapping:a=5,b=10
After swapping:a=10,b=5
