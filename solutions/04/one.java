import java.util.Scanner;
public class one{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Maximum: "+returnMax(a,b,c));
        System.out.println("Minimum: "+returnMin(a,b,c));

    }

    public static int returnMax(int a,int b,int c){
        if(a>b&&a>c)
            return a;
        else if(b>c)
            return b;
        else
            return c;

    }
    public static int returnMin(int a,int b,int c){
        if(a<b&&a<c)
            return a;
        else if(b<c)
            return b;
        else
            return c;

    }
}
