import java.util.Scanner;

public class E4_1{

	private static int w[];			//��ȡ����,һ��2*nλ
	private static int p[];			//��ע�ǿ�ʼ(0),���ǽ���(1)
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		w = new int[2*n];
		p = new int[2*n];
		for(int i=0;i<2*n;i++){
			w[i] = in.nextInt(); 
			p[i] = i%2;		
		}
		
		QuickSort(w,0,2*n-1);		//w��ʱ����������
		System.out.print(GreedySelector(w));
		
	}
	private static int GreedySelector(int[] w) {
		// TODO Auto-generated method stub
		int num =0;
		int max =0;
		int temp =0;
		for(int i = 0;i<w.length;i++){
			
			if(i<w.length-1&&w[i+1]==w[i]){			//����һ��ʱ���뵱ǰʱ����ȵ�ʱ�����ǲ�����max		
				if(p[i]==0){			
					temp++;
					
				}
				else{
					temp--;
				}
				
			}
			else{
				if(p[i]==0){			//�ǿ�ʼʱ��ͼ�һ
					num=num+temp+1;
					temp =0;
					
				}
				else{
					num=num+temp-1;		//�ǽ���ʱ��ͼ�һ
					temp =0;
				}
				if(max<num){
					max = num;
				}
			}
			
			
			
			
		}
		return max;
	}
	
	
	private static void QuickSort(int[] a, int p, int r) {	//��������
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