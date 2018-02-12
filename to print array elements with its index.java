package index;

import java.util.Scanner;

/**
 *
 * @author Lakshana Sampath
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();;
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
          
        }
        for(int i=0;i<n;i++){
        System.out.println(a[i]+" "+i);
        }
        // TODO code application logic here
    }
    
}
