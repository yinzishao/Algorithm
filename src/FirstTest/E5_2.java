package FirstTest;

import java.util.Scanner;

public class E5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Knap knap = new Knap();
		knap.backtrack(1);
		System.out.println(knap.bestp);
	}
	
}

class Knap{
	//背包容量,物品数,物品重量数组,物品价值数组,当前重量,当前价值,当前最优价值
	int c;
	int n;
	int w[];
	int p[];
	int cw;
	int cp;
	int bestp;
	Knap(){
		Scanner in  = new Scanner (System.in);
		n = in.nextInt();
		c = in.nextInt();
		w = new int[n+1];
		p = new int[n+1];
		for(int i =1;i<=n;i++){
			p[i] = in.nextInt();
		}
		for(int i =1;i<=n;i++){
			w[i] = in.nextInt();
		}
		
	}
	void backtrack(int i){
		if(i>n){
			bestp=cp;
			return;
		}
		if(cw+w[i]<=c){
			cw+=w[i];
			cp+=p[i];
			backtrack(i+1);
			cw-=w[i];
			cp-=p[i];
			
		}
		if(bound(i+1)>bestp)
			backtrack(i+1);
		
		
	}
	private int bound(int i) {
		// TODO Auto-generated method stub
		int cleft = c -cw;
		int b = cp;
		while(i<=n&&w[i]<=cleft){
			cleft -= w[i];
			b+=p[i];
			i++;
			
		}
		if(i<=n) b+=p[i]*cleft/w[i];
		return b;
	}
}