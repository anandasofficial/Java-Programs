import java.util.Scanner;

public class Reverse {
    public static void main(String ar[]) {
        int number, reverse = 0, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number:");
        temp = s.nextInt();
        while(temp > 0)
        {
            number = temp % 10;
            reverse = reverse * 10+number;
            temp = temp / 10;
        }
        System.out.println("Reverse:"+reverse);


    }
}










