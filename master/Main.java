package master;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public Main() {
        super();
    }
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
               
               //Number of villages
               int n;
               n = s.nextInt();                 
               
               //Village profits in array
               int [] a= new int[n];
               int i,j,profit,currentVillage;
               for(i=0;i<n;i++)
               {
                   a[i]=s.nextInt();
               }
               
               //Finding the all possible village paths
               TreeSet<Integer> profitSet=new TreeSet<Integer>();
               for(i=n-1;i>0;i--)
               {
               profit=a[i];
               currentVillage=i;
               //Finding the village path for current village
               for(j=i-1;j>=0;j--)
               {
                   if(a[currentVillage]%a[j]==0)
                   {
                       profit+=a[j];
                       currentVillage=j;
                   }
               }
               profitSet.add(profit);
               }
               
               //Printing the profit
               System.out.println(profitSet.last());

       
    
   }
}
