 import java.util.*;
 public class JavaOperator{
    public static void main(String args[])
    {
        int x,y,z;
       /* int exp1=(x*y/x);
        int exp2=(x*(y/x));
        System.out.print(exp1 + " , ");
        System.out.print(exp2);*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers!");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        if(x>y&&y>z)
        {
            System.out.println("hello");
        }
        
        if(z>y && z<x)
        {
            System.out.println("java");
        }
        
        if((y+200)<x&&(y+500)<z)
        {
            System.out.println("hello java");
        }


    }

}