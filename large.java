import java.util.Scanner;
class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The largest number is: " + largest);
    }
}

ooutput:
Enter three numbers:11 23 45
the largest number is:45
