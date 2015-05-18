package FirstTest;
import java.util.Scanner;



public class Fifth {
	public static void main(String argc[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int w[] = new int[n];
		int m[] =new int[n];
		for(int i = 0; i<n;i++){
			w[i] = in.nextInt();
			m[i] =1;
		}
		
		for(int i = 0; i<n;i++){
			for(int k =i+1;k<n;k++){
				if(w[i]>w[k]){
					if(m[k]<m[i]+1){
						m[k]=m[i]+1;
					}
					
				}
			}
		
		
		}
		int max =m[0];
		for(int i = 1; i<n;i++){
			if (m[i]>max){
				max = m[i];
			}
			
		}
		System.out.print(max);
	}

}
