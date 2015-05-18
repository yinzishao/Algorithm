package FirstTest;

import java.util.Scanner;


public class Second {
	public static void main(String argc[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n==1){
			System.out.println(in.nextInt());
		}
		else{
			int w[][] = new int [n][n] ;
			int m[][] = new int [n][n];
			for(int i =0;i<n;i++){
				for(int k =0;k<=i;k++){
					w[i][k] = in.nextInt();
					
				}
				
			}
			m[0][0] = w [0][0];
			for(int i =1;i<n;i++){
				for(int k =0;k<=i;k++){
					
					if(k==0){
						m[i][k] =m[i-1][k]+w[i][k];
					}
					else if(k==i){
						m[i][k] =m[i-1][k-1]+w[i][k];
					}
					else{
						if(m[i-1][k]>m[i-1][k-1]){
							m[i][k] = m[i-1][k]+w[i][k];
						}
						else{
							m[i][k] = m[i-1][k-1]+w[i][k];
						}
					}
				}
				
			}
			
			int temp = m [n-1][0];
			for(int i = 1; i<n;i++){
				if(m[n-1][i]>temp){
					temp =m[n-1][i];
				}
			}
			System.out.println(temp);
		}
		
	}
}