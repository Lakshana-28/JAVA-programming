import java.util.Scanner;
      
      
        
public class Solution {    
      
      
        public static void main(String[] args) {       
      
      
        Scanner scan = new Scanner(System.in);        
      
      
        int a[]=new int[25];        
      
      
        int n = scan.nextInt();                      
      
      
        for(int i=0;i<n;i++)  
      
      
        {         
      
      
        a[i]=scan.nextInt(); 
      
      
        }        
      
      
        int max=a[0];                    
      
      
        for(int i=0;i<n;i++) {
      
      
        {                 
      
      
        if(max<a[i])  
      
      
        {                      
      
      
        max=a[i];   
      
      
        }                     
      
      
        System.out.println(max);           
      
      
        }
      
      
        }
