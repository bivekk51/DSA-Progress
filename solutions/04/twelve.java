import java.util.Scanner;
public class twelve{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println(isPythogorean(a,b,c));
    }

    public static boolean isPythogorean(int a,int b,int c){
        if((square(a)+square(b))==square(c))
            return true;
        else if((square(c)+square(b))==square(a))
            return true;
        else if((square(a)+square(c))==square(b))
            return true;
        else
            return false;
    }

    public static int square(int n){
        return n*n;
    }
    
}
