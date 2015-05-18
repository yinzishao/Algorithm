package FirstTest;

import java.util.Scanner;


public class Third {
	public static void main(String argc[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int w[][] = new int [n+1][n+1]; //w[i][j] i dao j de feiyong
		int m[][] = new int [n+1][n+1];

		for(int i =1;i<n;i++){
			for(int k =i+1;k<n+1;k++){
				w[i][k] = in.nextInt();
//				System.out.println(w[i][k]);
			}
			
		}
//		for(int i =0;i<n+1;i++){
//			for(int k =0;k<n+1;k++){
//				
//				System.out.print(w[i][k]+" ");
//			}
//			System.out.println("");
//			
//		}
//		
		m[n-1][n] = w[n-1][n];
		
		for(int i = n-2;i>0;i--){
			
			for(int k =i+1;k<n+1;k++){
				
				if((k-i)==1){
					m[i][k] = w[i][k];
					
				}
				else{
					int min=w[i][k];
					for(int s =i+1;s<k;s++){
						if((m[i][s]+m[s][k])< min)
						min =m[i][s]+m[s][k];
					}
					m[i][k]=min;
				}
				
			}
		}
		System.out.print(m[1][n]);
	}
}
