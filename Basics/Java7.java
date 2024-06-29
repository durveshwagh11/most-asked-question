//Check Whether the Year is a Leap Year in Java
import java.util.Scanner;

public class Java7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 400 == 0)
            System.out.println (year + " is a Leap Year");
        else if (year % 4 == 0 && year % 100 != 0)
            System.out.println (year + " is a Leap Year");
        else
            System.out.println (year + " is not a Leap Year");
    }
}



//Using Ternary Operator
//
//    public static void main (String[]args)
//    {
//
//        int year = 2019;
//
//        int flag = (year%400 == 0) || (year%4==0 && year%100!=0 ) ? 1 : 0;
//        if (flag ==1)
//        {
//            System.out.println (year + " is a Leap Year");
//        }
//        else
//        {
//            System.out.println (year + " is not a Leap Year");
//        }
//    }
