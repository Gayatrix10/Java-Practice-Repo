import java.util.Scanner;

class Percentage{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m1,m2,m3,m4,m5;
        System.out.println("Enter marks (out of 100) for 1st subject ...");
        m1=sc.nextInt();

        System.out.println("Enter marks (out of 100) for 2nd subject ...");
        m2=sc.nextInt();

        System.out.println("Enter marks (out of 100) for 3rd subject ...");
        m3=sc.nextInt();

        System.out.println("Enter marks (out of 100)for 4th subject ...");
        m4=sc.nextInt(); 

        System.out.println("Enter marks (out of 100) for 5th subject ...");
        m5=sc.nextInt();

        double Percentage;
        Percentage =(((m1+m2+m3+m4+m5)/500.0)*100);

        System.out.println("CBSE Exam Percentage : "+Percentage);
    }
}