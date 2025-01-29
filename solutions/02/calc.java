import java.util.Scanner;
public class calc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter operator");
        char opr=sc.nextLine().charAt(0);
        if(opr=='+')
            System.out.println(a+b);
        else if(opr=='*')
            System.out.println(a*b);
        else if(opr=='-')
            System.out.println(a-b);
        else if(opr=='/')
            System.out.println(a/b);


    }
}