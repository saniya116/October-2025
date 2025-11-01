import java.util.Scanner;
class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}

output:
Enter start number:1
Enter end number:10
Sum of even numbers:30
Sum of odd numbers:25
