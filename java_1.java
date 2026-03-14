
import java.util.Scanner;

public class java_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for rows and columns:");
       int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
        for (int i = num - 1; i >= 1; i--) {

            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}