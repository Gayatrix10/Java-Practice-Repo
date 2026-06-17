import java.util.Scanner;

public class Function {
    static void printName(String Name){
        System.out.println(Name);
    }
   
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Name= sc.next();
        printName(Name);
        sc.close();
    }
}
