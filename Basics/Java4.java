//Find the Sum of the Numbers in a Given Range in Java

import java.util.Scanner;

public class Java4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for(int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
