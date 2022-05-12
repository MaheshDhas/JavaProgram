import java.util.*;
public  class MainFindingPrimeNumber{
   public static void main (String[] args)
   {		
      int num;
      System.out.println("enter a number");

      Scanner  md = new Scanner (System.in);
      num=md.nextInt();
      
      if (num%2==0){

         System.out.println(num+"is a even number ");
      }
      else {
         System.out.println(num+"is a odd number ");
      }

   }

   }
