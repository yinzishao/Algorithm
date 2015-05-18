package FirstTest;

import java.util.Scanner;


public class First {
	private static int num;
	private static int flag;
	public static void main(String argc[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int T[]= new int[n];
		for(int i = 0;i<n;i++){
			T[i]= in.nextInt();
		}
		find(T,0,n);
		if(flag!=1){
			System.out.println(-1);
			System.out.println(num);
		}
	}
	
	public static void find(int []t,int i,int l){
	

		if(i<=l){
			
			int m = (i+l)/2;
			if(t[m]==m){
				flag =1;
				num++;
				System.out.println(m);
				System.out.println(num);
			}
			else{
				if(t[m]<m){
					num++;
					find(t,m+1,l);
					
				}
				else{
					num++;
					find(t,i,m-1);
					
				}
			}
		
		}

	}
}
