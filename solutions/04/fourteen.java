import java.util.Scanner;
public class fourteen{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        ListPrime(a,b);
    }

    public static void ListPrime(int a,int b){
        for(int i=a;i<=b;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    count++;
            }
            if(count==2)
                System.out.println(i);
        }
        
    }
    
}
