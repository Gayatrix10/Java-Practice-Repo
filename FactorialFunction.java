

public class FactorialFunction {

    static void factorial(int num){
        // num=10;
        int result=1;
        for(int i=num;i>=1;i--){
            result=result*i;
        }
            System.out.println("Factorial of "+num+" is : "+result);

    }
public static void main(String[] args) {
    factorial(11);
}
    
}
