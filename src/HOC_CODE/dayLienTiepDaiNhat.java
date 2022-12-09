package HOC_CODE;

import java.util.HashSet;
import java.util.Scanner;

public class dayLienTiepDaiNhat {    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		longArr(arr);
	}
	
	private static void longArr(int[] array) {
		HashSet<Integer> hSet = new HashSet<Integer>();
		for(int i : array) {
			hSet.add(i);
		}
		int[] b = new int[1001];
		int length = 0;
		for(int i : array) {
			for(int j = i - 1; hSet.contains(j); j--) {
				hSet.remove(j);
				b[length] = j;
				length++;	
			}
			for(int j = i + 1; hSet.contains(j); j++) {
				hSet.remove(j);
				b[length] = j;
				length++;	
			}
		}
		for(int i = 0; i < length; i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.println();
		int count = 0;
		for(int i = 0; i < length; i++) {
			count++;
		}
		System.out.print(count);
	}
}