import java.util.Scanner;


public class E3_1 {
	private static int[] x;
	private static int[] y;
	private static int n;

	public static void main(String [] argc){
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		x = new int[n];
		y = new int[n];
		for(int i = 0;i<n;i++){
			x[i]= in.nextInt();
		}
		for(int i = 0;i<n;i++){
			y[i]= in.nextInt();
		}
		findmid(x,y,n);
	}
	
	static void findmid (int [] x, int [] y, int n){
		if(n == 2){						//每个得到最后两个，进行比较得出中位数
			int xt = x[0]>y[0]?x[0]:y[0];
			int yt = x[1]<y[1]?x[1]:y[1];
			if(xt>yt){
				System.out.println(yt+ " " +xt);
			}
			else{
				System.out.println(xt+ " " +yt);
			}
			  
		}
		else{
			
			if( (n%2) ==0){            //偶数
				
				if(x[n/2-1]==y[n/2]){
					System.out.println(x[n/2-1] + " " +y[n/2]);					
				}
				
				else{if(x[n/2-1]>y[n/2]){
					int [] xt = new int [n/2];
					int [] yt = new int [n/2];
					for(int i = 0; i<(n/2);i++){
						xt[i]= x[i];
						yt[i]= y[n/2+i];
						
					}
					findmid(xt,yt,n/2);
				}
				else{
					int [] xt = new int [n/2+1];
					int [] yt = new int [n/2+1];
					for(int i = 0; i<n/2+1;i++){
						xt[i]=x[n/2-1+i];
						yt[i]=y[i];
						
					}
					findmid(xt,yt,n/2+1);
				}
					
				}
				
			}
			
			else{						//奇数
				int [] xt = new int [(n+1)/2];
				int [] yt = new int [(n+1)/2];
				if(x[(n+1)/2]>y[(n+1)/2]){
					for(int i = 0; i < (n+1)/2;i++){
						xt[i]= x[i];
						yt[i]= y[(n-1)/2+i];
						
					}
					findmid(xt,yt,(n+1)/2);
					
				}
				else {
					for(int i = 0; i < (n+1)/2;i++){
						xt[i]= x[(n-1)/2+i];
						yt[i]= y[i];
						
					}
					findmid(xt,yt,(n+1)/2);
				}
			}
		}
		

		
		
	}

}
