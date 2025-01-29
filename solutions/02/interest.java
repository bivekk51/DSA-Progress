import java.util.Scanner;
public class interest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p,t,r,si;
        System.out.println("Input p,t,r");
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        si=p*t*r/100;
        System.out.println(si);
    }
}