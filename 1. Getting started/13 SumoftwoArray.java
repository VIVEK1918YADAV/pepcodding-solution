import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
   Scanner s=new Scanner(System.in);
   int n1=s.nextInt();
   int a1[]=new int[n1];
   for(int i=0;i<a1.length;i++)
   {
       a1[i]=s.nextInt();
   }
   int n2=s.nextInt();
   int a2[]=new int[n2];
   for(int i=0;i<a2.length;i++)
   {
       a2[i]=s.nextInt();
   }
   int sum[]=new int[n1>n2?n1:n2];
   int c=0;
   int i=a1.length-1;
   int j=a2.length-1;
   int k=sum.length-1;
   while(k>=0)
   { int d=c;
       if(i>=0)
        d+=a1[i];
    if(j>=0)
       d+=a2[j];
    c= d/10;
    d=d%10;
    sum[k]=d;
    i--;
    j--;
    k--;

   }
   if(c != 0){
       System.out.println(c);
   }
   for(int val:sum)
    System.out.println(val);
 }

}
