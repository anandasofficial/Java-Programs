import java.util.Scanner;

public class Swap {
    public static void main(String ar[]) {
        int a, b, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a = s.nextInt();
        System.out.println("Enter the value of b:");
        b = s.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.print("After swapping a = "+a);
        System.out.print("After swapping b = "+b);

    }
}










