import java.util.Scanner;

public class Avg {

    static void avg(int a, int b, int c) {
        double average = (a + b + c) / 3.0;
        System.out.println("Average = " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        avg(a, b, c);
    }
}