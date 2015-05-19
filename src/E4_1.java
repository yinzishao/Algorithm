import java.util.Scanner;

public class E4_1{

	private static int w[];			//存取数据,一共2*n位
	private static int p[];			//标注是开始(0),还是接受(1)
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		w = new int[2*n];
		p = new int[2*n];
		for(int i=0;i<2*n;i++){
			w[i] = in.nextInt(); 
			p[i] = i%2;		
		}
		
		QuickSort(w,0,2*n-1);		//w按时间升序排序
		System.out.print(GreedySelector(w));
		
	}
	private static int GreedySelector(int[] w) {
		// TODO Auto-generated method stub
		int num =0;
		int max =0;
		int temp =0;
		for(int i = 0;i<w.length;i++){
			
			if(i<w.length-1&&w[i+1]==w[i]){			//当下一个时间与当前时间相等的时候我们不更新max		
				if(p[i]==0){			
					temp++;
					
				}
				else{
					temp--;
				}
				
			}
			else{
				if(p[i]==0){			//是开始时间就加一
					num=num+temp+1;
					temp =0;
					
				}
				else{
					num=num+temp-1;		//是结束时间就减一
					temp =0;
				}
				if(max<num){
					max = num;
				}
			}
			
			
			
			
		}
		return max;
	}
	
	
	private static void QuickSort(int[] a, int p, int r) {	//快速排序
		// TODO Auto-generated method stub
		if(p<r){
			int q = Partition (a,p,r);
			QuickSort(a,p,q-1);
			QuickSort(a,q+1,r);
		}
	}
	private static int Partition(int[] a, int q, int r) {
		// TODO Auto-generated method stub
		int i =q, j =r +1;
		int x = a[q];
		int y = p[q];
		while(true){
			while(a[++i]<x&&i<r);
			while(a[--j]>x);
			if(i>=j) break;
			Swap(i,j);
			
			
		}
		a[q] = a[j];
		p[q] =p[j];
		a[j] = x;
		p[j] = y;
		return j;
	}
	private static void Swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp = w[i];
		int ptemp =p[i];
		p[i] =p[j];
		p[j] = ptemp;
		w[i] =w[j];
		w[j] = temp;

		
	}
}