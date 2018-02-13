/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time_difference;

import java.util.Scanner;

/**
 *
 * @author Lakshana Sampath
 */
public class Time_difference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();
        int h1=sc.nextInt();
        int m1=sc.nextInt();
        h=h*60+m;
        h1=h1*60+m1;
        int dif=h1-h;
        if(dif<0||dif>=60)
        {
            h=dif/60;
            h1=dif%60;
            System.out.println(Math.abs(h)+":"+Math.abs(h1));
            
        }
        else
        {
            System.out.println(Math.abs(dif)+"mins");
        }
        
        // TODO code application logic here
    }
    
}

