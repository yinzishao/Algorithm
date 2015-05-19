import java.util.Scanner;


public class E3_3DP {
	private static int n;
	private static int k;
	private static int m[][];
	private static int w[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  in = new Scanner (System.in);
		n=in.nextInt();
		int [] a = new int [n];
		w = new int[n+1][n+1];
		k = in.nextInt();
		m = new int [n+1][k+1];
		
		String sn = String.valueOf(in.nextInt());
		char[] snc = sn.toCharArray();
		for(int i = 0 ; i < snc.length; i++){
			a[i] = Integer.parseInt(snc[i]+"");
//			System.out.print(a[i]);
			
		}
		
		for(int i=1;i<=n;i++){
			w[i][i] =a[i-1];
			for(int j = i+1; j<=n; j++){
				w[i][j] = w[i][j-1]*10 +a[j-1];
			}
		}
		maxdp(n,k,a);
		System.out.println(m[n][k]);
	}
	
	public static void maxdp(int n ,int k , int[] a){
		
		int temp = 0;
		for(int i = 1;i<=n;i++){
			m[i][1] = w[1][i];
		}
		//ºËÐÄË¼Â·
		for(int i = 1;i<=n;i++){
			for(int j=2;j<=k;j++){
				int max  = 0;      
				for(int d=1;d<i;d++ ){
					int ma = m[d][j-1];
					int wa = w[d+1][i];
					if(( temp = ma*wa) > max){
						max = temp;
						
					}
				}
				m[i][j]= max;
			}
		}
	}
}
