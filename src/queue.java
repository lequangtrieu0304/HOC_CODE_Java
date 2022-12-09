import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		int n, k;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		boolean[] b = new boolean[1001];
		int[] arr = new int[n];
		
		for(int i= 0; i< 1001; i++) {
			b[i] = false;
		}
		for(int i = 0; i< n; i++) {
			arr[i] = sc.nextInt();
		}
		k = sc.nextInt();
		
		for(int i = 0; i< n; i++) {
			if(!b[arr[i]]) {
				if(q.size() < k) {
					b[arr[i]] = true;
					q.add(arr[i]);
				}
				else {
					b[q.peek()] = false;
					b[arr[i]] = true;
					q.add(arr[i]);
					q.remove();
				}
			}
		}
		
		while(!q.isEmpty()) {
			System.out.print(q.peek() + " ");
			q.remove();
		}
	}
}
