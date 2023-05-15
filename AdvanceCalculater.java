import java.util.*;
public class AdvanceCalculater{
    public static boolean isPrime(int n)
    {
        if (n==2 || n==1)
        {
        return true;
        }

        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
             return false;
        }
        return true;
    }

    public static void primeInRange(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(isPrime(i))

             System.out.print(i+" ");
        }
        System.out.println();
    }

    public static int sum(int a,int b, int c)
    {
        return a+b+c;
    }

    public static float sum(float a, float b, float c)
    {
        return a+b+c;
    }
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }

    public static int bincoffisent(int n,int r)
    {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int bionoff = fact_n/fact_r*fact_nmr;

        return bionoff;
    }
    public static int sum(int ...arr)
    {
        int result=0;
        int a=0;
        for(a:arr)
        {
            return += a;
        }
    }

    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        primeInRange(n);
        float result=sum(4.0f,9.0f,9.0f);
        System.out.println(result);
        System.out.println(sum( 4,5,7,8));
        int fact = factorial(n);
        System.out.println(fact);

    }




}