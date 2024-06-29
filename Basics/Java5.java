//Find the Greatest of the Two Numbers in Java


import java.util.Scanner;

public class Java5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int temp = 0;
        if(a == b){
            System.out.println("Both number are eqaul");
        } else {
            temp = Math.max(a, b);
        }
        System.out.println(temp);
    }
}
