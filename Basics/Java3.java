//Find the Sum of First N Natural Numbers in Java

import java.util.Scanner;

public class Java3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <=n; i++){
            sum +=  i;
        }
        System.out.println(sum);
    }
}
