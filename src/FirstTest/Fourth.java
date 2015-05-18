package FirstTest;

import java.util.Scanner;


public class Fourth {
	private static int w [];
	public static void main(String argc[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		w= new int [n]; 
		for(int i = 0 ;i<n;i++){
			w[i]  = in.nextInt();
		}
		int result = find(w,0,n-1,k-1);
			System.out.println(w[result]);
		
		
		
	}

	private static int find(int[] w, int i, int n, int k) {
		
		if(i<n){
			int p =partiton(w,i,n);
			if(p==k){
				return p;
			}
			else{
				if(p<k){
					return find(w,p+1,n,k);
				}
				else{
					return find(w,i,p-1,k);
				}
				
			}
		}
		else return n;
	
	}

	private static int partiton(int[] w, int p, int r) {
		int i = p, j = r+1;
		int x = w [p];
		while(true){
			while(w[++i]<x&&i<r);
			while(w[--j]>x);
			if(i>=j) 
				break;
			swap(i,j);
			
		}
		w[p] = w[j];
		w[j] = x;
		return j;
		
	}

	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp = w[i];
		w[i] = w[j];
		
		w[j]= temp;
	}
}
