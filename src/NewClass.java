/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NewClass {
	private static int n;
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int k=in.nextInt();
        int a[]=new int[k*2];
        for(int i=0;i<k+1;i++)
        {
            a[i]=in.nextInt();
        }
        int s=oil(n,k,a);
        System.out.print(s);
        }

    private static int oil(int m,int k,int a[]) {
      int j=0;
      int sum=0;
      while(j<k+1){
          if(a[j]<=m)
             {m=m-a[j];
              j++;}
          else
          {   sum++;
              m=n;
              if(a[j]>n)
              {System.out.print("No Solution!");
              System.exit(0);
              }
          }
      }
     return sum;  
    }
    
        
        
    }