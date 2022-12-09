package HOC_CODE;

import java.util.Scanner;

public class phanTuLonThu2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		max_2(arr, n);
	}
	
	public static void max_2(int array[], int n) {
		int max_1, max_2;
		max_1 = max_2 = Integer.MIN_VALUE;
		if(n < 2) {
			return;
		}
		for(int i=0; i<n; i++) {
			if(array[i] > max_1) {
				max_2 = max_1;
				max_1 = array[i];
			}
			else if(array[i] > max_2 && array[i] != max_1) {
				max_2 = array[i];
			}
		}
		if(max_2 == Integer.MIN_VALUE) {
			System.out.println("Not found Max2");
		}
		else {
			System.out.println(max_2);
		}
	}
}
