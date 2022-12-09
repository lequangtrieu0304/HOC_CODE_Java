import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		mergeSort(arr);
		
		System.out.print("mảng sau khi sắp xếp: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void mergeSort(int[] array) {	
		int length = array.length;
		if(length <= 1) return;
		
		int middle = length / 2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];
		
		int i = 0;
		int j = 0;
		for(i = 0; i < length; i++) {
			if(i < middle) {
				leftArray[i] = array[i];
			}
			else {
				rightArray[j] = array[i];
				j++;
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);
		
	}
	
	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0;
		
		while(l < leftSize  && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				l++;
				i++;
			}
			else {
				array[i] = rightArray[r];
				r++;
				i++;

			}
		}
		while(l < leftSize) {
			array[i] = leftArray[l];
			l++;
			i++;
		}
		while(r < rightSize) {
			array[i] = rightArray[r];
			r++;
			i++;
		}
	}
}
