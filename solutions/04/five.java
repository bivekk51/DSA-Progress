import java.util.Scanner;
public class five{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Product: "+calcProd(a,b));
    }

    public static int calcProd(int a,int b){
        return a*b;
    }
    
}
