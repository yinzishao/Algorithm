import java.util.Scanner;


public class E4_2 {
	public static void main (String [] argc){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); //汽车加满油可以走的路程
		int k = in.nextInt();
		int [] p = new int [k+1];
		for(int i = 0; i<p.length;i++){
			p[i] = in.nextInt();
			if(p[i]>n){
				System.out.println("No Solution!");			//加油站间距离大于汽车可以走的最大路程
				System.exit(0);	
			}
		}
		int s = 0;
		int temp = 0;
		for(int i = 0; i<p.length;i++){
			temp += p[i];
			while(temp>n){
				s++;
				temp = 0;
				i--;
			}
			
		}
		System.out.println(s);
		
		
	}
	
}
