import java.util.Scanner;
public class infinite{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0,num;
        String a;
        while(true){
            System.out.println("Input a number(Press x to stop)");
            a=sc.nextLine();

            if(a.equals("x")) 
                break;
            num=Integer.parseInt(a);
            sum+=num;
        }
        System.out.println(sum);
    }
}