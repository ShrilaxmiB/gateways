package master;

import java.util.ArrayList;

public class Main {
    public Main() {
        super();
    }
   public static void main(String args[]) {
       int a[]={3,4,5,6};
       ArrayList<Integer> a1=new ArrayList<Integer>();
      for(int i=0;i<a.length;i++) {
          a1.add(a[i]);
      }
      System.out.println(a1);
   }
}
