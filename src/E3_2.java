import java.util.Arrays;
import java.util.Scanner;

public class E3_2  {
	public static int count = 0;
	public static int [] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		arr = new int[n];
		for(int i = 0;i<n;i++){
			arr[i]= in.nextInt();
		}
		int[] result = sort_and_count(arr);
		System.out.println(count);
		
	}

	private static int[] sort_and_count(int[] arr) {
		if (arr.length == 1) {
			return arr;
		}
		int length = arr.length;
		int alength = length / 2;
		int A[] = Arrays.copyOfRange(arr, 0, alength);
		int B[] = Arrays.copyOfRange(arr, alength, length);
		A = sort_and_count(A);
		B = sort_and_count(B);
		arr = merge_and_count(A, B);
		return arr;
	}

	private static int[] merge_and_count(int[] a, int[] b) {
		int i = 0;
		int j = 0;
		int result[] = new int[a.length+b.length];
		int current = 0;
		while (i < a.length && j < b.length) {
			if(a[i]<b[j]){		
				result[current++] = a[i];
				i++;
			}
			else{
				result[current++] = b[j];
				count += (a.length - i);
				j++;
			}
		}
		if(i==a.length){	
			for(;j<b.length;j++){
				result[current++] = b[j]; 
			}
		}
		if(j==b.length){
			for(;i<a.length;i++){
				result[current++] = a[i]; 
			}
		}
		return result;
	}
}
