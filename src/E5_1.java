import java.util.Scanner;

public class E5_1 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in  =new Scanner(System.in);
			int n = in.nextInt();
			work w = new work(n);
			for(int i=1;i<=w.n;i++){
				for(int j=1;j<=w.n;j++){
					w.c[i][j]=in.nextInt();
				}
			}
			for(int j=1;j<=w.n;j++)  
		    {  
		        w.flag[j]=0;  
		    } 
			w.backtrack(1);
			System.out.println(w.bestw);
	}


}
class work{
	int n;
	int cw;
	int bestw;
	int []flag;
	int [][]c;
	
	work(int n){
		this.n = n;
		flag = new int[n+1];
		c = new int [n+1][n+1];
		this.bestw = 100000;
		this.cw =0;
	}
	void backtrack(int t){
		int j;
		if(t>n){
			if(cw<bestw){
				bestw = cw;
			}
			return;
		}
		else{
			for(int i =1;i<=n;i++){
				if(cw<bestw&&flag[i]==0){
					 	cw+=c[t][i];  
		                flag[i]=1;  
		                backtrack(t+1);  
		                cw-=c[t][i];  
		                flag[i] = 0;
				}
			}
		}
	}
}