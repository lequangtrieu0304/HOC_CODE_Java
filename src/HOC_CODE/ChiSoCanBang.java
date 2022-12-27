package HOC_CODE;

import java.util.Scanner;

public class ChiSoCanBang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		int sumLeft = 0;
		boolean ok = false;
		for(int i=0; i<n; i++) {
			sum -= arr[i];
			if(sum == sumLeft) {
				System.out.print(i+ " ");
				ok = true;
			}
			sumLeft += arr[i];
		}
		if(!ok) {
			System.out.println("not found");
		}
 	}
}
