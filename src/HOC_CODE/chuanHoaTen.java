package HOC_CODE;

import java.util.Scanner;

public class chuanHoaTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] words = s.split(" ");
		
		System.out.print(words[words.length -1].toUpperCase()+ " ");
		for(int i = 0; i < words.length - 1; i++) {
			phanTuDau(words[i]);
			if(i == (words.length -2)) {
				System.out.print(",");
			}
			else {
				System.out.print(" ");
			}
		}
	}
	
	public static void phanTuDau(String s) {
		char[] ch = s.toCharArray();
		ch[0] = Character.toUpperCase(ch[0]);
		System.out.print(ch[0]);
		for(int i = 1; i < ch.length; i++) {
			ch[i] = Character.toLowerCase(ch[i]);
			System.out.print(ch[i]);
		}
		
	}
}
