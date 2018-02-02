package sample;

import java.util.*;
class Sample
{
public static void main(String aa[])
{
  int a[]=new int[5];
  Scanner s=new Scanner(System.in);
  //int n=s.nextInt();
  for(int i=0;i<a.length;i++)
  {
    a[i]=s.nextInt();
    
  }


   Arrays.sort(a);
  
  for(int i=0;i<a.length;i++)
  {
    System.out.println(a[i]);
  }
}
}
