import java.util.Scanner;

public class Question1	{
	int key, j;
	
	void sort(int arr[]) {
		
		int n = arr.length;
		
		for(int i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
		
			while(j >= 0 && arr[j] > key) {
				
				arr[j+1] = arr[j];
				j = j - 1;
				printArray(arr);
			}
			arr[j+1] = key;
		}
	}
	
	static void printArray(int arr[]) {
		
		int n = arr.length;
		
		for(int i = 0; i < n; ++i) 
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
		
		int a1[] = new int[n];
		
		for(int i = 0; i < n; ++i)
			a1[i] = sc.nextInt();
		
		Question1 ob = new Question1();
		System.out.println();
		ob.sort(a1);
		printArray(a1);
	}
}