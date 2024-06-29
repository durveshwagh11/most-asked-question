//Find the Greatest of the Three Numbers in Java

import java.util.Scanner;

public class Java6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int temp, result;
        temp = Math.max(a, b);
        result = Math.max(c, temp);
        System.out.println(result);
    }
}
