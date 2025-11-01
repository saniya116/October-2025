import java.util.Scanner;
class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int result = 0;
         while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, 3);
            num /= 10;
        }
        if (result == originalNum)
            System.out.println(originalNum + " is an Armstrong Number.");
        else
            System.out.println(originalNum + " is not an Armstrong Number.");
    }
}

output:
Enter a number:153
153 is an Armstrong Number
