import java.util.Scanner;
public class greater{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int greater=a>b?a:b;
        System.out.println(greater);

    }
}