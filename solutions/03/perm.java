public class perm{
    public static void main(String[] args){
        int nPr,nCr,n=5,r=2;
        nPr=factorial(n)/(factorial(n-r));
        nCr=factorial(n)/(factorial(r)*factorial(n-r));

        System.out.println(nPr);
        System.out.println(nCr);

    }
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        return fact;
    }
}