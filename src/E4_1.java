import java.util.Scanner;

public class E4_1{

	private static int w[][];
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		w = new int[n][2];
		for(int i=0;i<n;i++){
			for(int j = 0;j<2;j++){
				w[i][j] = in.nextInt(); 
			}
		}
		QuickSort(w,0,n-1);
		for(int i =0; i<n;i++){
			System.out.println(w[i][1]);
		}
		System.out.print(GreedySelector(w));
		
	}
	private static int GreedySelector(int[][] w) {
		// TODO Auto-generated method stub
		int num =1 ;
		int end = w[0][1];
		for(int i = 1;i<w.length;i++){
			if(w[i][0]>end){
				end = w[i][1];
				num++;
			}
		}
		return num;
	}
	private static void QuickSort(int[][] a, int p, int r) {
		// TODO Auto-generated method stub
		if(p<r){
			int q = Partition (a,p,r);
			QuickSort(a,p,q-1);
			QuickSort(a,q+1,r);
		}
	}
	private static int Partition(int[][] a, int p, int r) {
		// TODO Auto-generated method stub
		int i =p, j =r +1;
		int x = a[p][1];
		int y = a[p][0];
		while(true){
			while(a[++i][1]<x&&i<r);
			while(a[--j][1]>x);
			if(i>=j) break;
			Swap(i,j);
			
			
		}
		a[p][1] = a[j][1];
		a[p][0] = a[j][0];
		a[j][1] = x;
		a[j][0] = y;
		return j;
	}
	private static void Swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp = w[i][1];
		int stemp = w[i][0];
		w[i][1] =w[j][1];
		w[i][0] =w[j][0];
		w[j][1] = temp;
		w[j][0] = stemp;
		
	}
}