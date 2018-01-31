 /*  * 
    * * 
   * * * 
  * * * * 
 * * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * */

import java.util.*;
class Pattern
{
   public static void main(String args[])
     {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the Range:");
      int n,i,j,k;
      n=scan.nextInt();
      for(i=1;i<=n;i++)
          {
            for(k=n;k>=i;k--)
                 {
                System.out.print(" ");
                 }
             for(j=1;j<=i;j++)
                 {
                System.out.print("* ");
                 }
             System.out.println();
         }
     for(i=1;i<=n;i++)
         {
         
            for(j=1;j<=i;j++)
             {
             System.out.print(" ");
             }
              for(k=n;k>=i;k--)
              {
            System.out.print("* ");
            }
          System.out.println();   
        }
} 
}
            
   
