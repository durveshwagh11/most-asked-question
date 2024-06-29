//Check if a Given Number is Positive or Negative in Java
import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0)
            System.out.println ("The number is positive");
        else if (num < 0)
            System.out.println ("The number is negative");
        else
            System.out.println ("The number is Zero");    }
}
