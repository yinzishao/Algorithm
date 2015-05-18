import java.util.Scanner;


public class Main {	
	private static Scanner input;

	public static void main(String argc[]){
		int max ;
		int n ;
		int c ;
		input = new Scanner(System.in);
		n = input.nextInt();		
		
		max = input.nextInt();
		
		for(int i = 0 ; i<n-1;i++){
			if((c=input.nextInt())>max){
				max = c;
			}
		}
		
		System.out.print(max);
	}
	
	
}
