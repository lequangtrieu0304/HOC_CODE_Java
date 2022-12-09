import java.util.Arrays;
import java.util.Scanner;

public class SapXepSo0Va1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sapXep(arr, n);
		System.out.println(Arrays.toString(arr));
	}

	private static void sapXep(int[] arr, int n) {
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				count++;
			}
		}
		
		for(int i = 0; i < count; i++) {
			arr[i] = 0;
		}
		
		for(int i = count; i < n; i++) {
			arr[i] = 1;
		}
	}
}
 