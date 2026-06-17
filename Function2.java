
import java.util.Scanner;

public class Function2 {
    
    static int sum(int a,int b){
        Scanner sc=new Scanner(System.in);
        
        return a+b;
    }

    public static void main(String[] args) {
        int result = sum(4,5);
        System.out.println("Sum = "+result);
    }
}
