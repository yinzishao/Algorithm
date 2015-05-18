import java.util.Scanner;


public class E3_4dizeng {
	private static int [] a ; //存取每个数据
	private static int [] w ;	// 每个数据的最长递增长度
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n  = in.nextInt();
		a = new int[n];
		w = new int[n];
		for(int i = 0;i<n;i++){
			a[i]= in.nextInt();
			w[i]=1;
//			System.out.println(a[i]);
		}
		System.out.print(init(a));
		
		
	}
	public static int init(int a[]){		
		int temp = 0;
		for(int i=a.length-1;i>=0;i--){
			
			for(int k = (i-1); k >=0; k--){
				
				
				if(a[i]>a[k]){
					if(w[i]+1>w[k]){
						w[k]= w[i]+1;
					}					
					if(w[k]>temp){
						temp = w[k];
					}
				}
			}
				
			
		}
		return temp;
	}
	
}
