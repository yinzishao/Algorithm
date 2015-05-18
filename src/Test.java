
public class Test {
	public static void main(String [] argc){
		int [] a = {1, 3,5,2 ,9};
		int [] w = {0,0,0,0,1};
		int temp = 0;
		for(int i=3;i>0;i--){
			System.out.print(i);
		}
		
		for(int i=3;i<0;i--){
			
			for(int k = (i-1); k <0; k--){
				
				if(a[i]>a[k]){
					w[k]= w[k]+w[i];
					if(w[k]>temp){
						temp = w[k];
					}
				}
			}
				
			
		}
	}
	
}
