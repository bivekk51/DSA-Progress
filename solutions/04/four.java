import java.util.Scanner;
public class four{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum: "+calcSum(a,b));
    }

    public static int calcSum(int a,int b){
        return a+b;
    }
    
}
