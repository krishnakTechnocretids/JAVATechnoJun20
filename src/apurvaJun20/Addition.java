package apurvaJun20;

import java.util.Scanner;
public class Addition
{
       public static void main(String[] ars)
       {
    	   Scanner input = new Scanner(System.in);
    	   int num,sum=0;
    	   System.out.print("Enter Numbers(Negative Number to  Quit) :");
           while(true)
                 {
                         num=input.nextInt();
                         if(num<0)
                         break;
                         sum +=num;
                 }
                         System.out.println( "Sum is : " +sum);
        }
}



