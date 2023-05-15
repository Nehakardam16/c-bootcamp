import java.util.*;
public class IncomeTexCalculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int salary,tax;
        System.out.println("Enter your salary");
        salary=sc.nextInt();
        if(salary<500000)
        {
            tax=0;
        }
        else if(salary>=500000 && salary<=1000000)
         {
            tax=(int)(salary*0.2);
        }
        else
        {
            tax=(int)(salary*0.3);
        }

        System.out.println("your tex is : "+ tax);


    }
}