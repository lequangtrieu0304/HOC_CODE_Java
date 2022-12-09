package HOC_CODE;

import java.util.Scanner;

public class inPhanTuDuyNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean[] b = new boolean[10001];
		for(int i = 0; i< 10001; i++) {
			b[i] = false;
		}
		for(int i =0; i< n; i++) {
			if(!b[arr[i]]) {
				System.out.print(arr[i]+ " ");
				b[arr[i]] = true;
			}
		}
	}
}

