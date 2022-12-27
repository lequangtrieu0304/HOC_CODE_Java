package HOC_CODE;

import java.util.Scanner;

public class chuanHoaEmail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String chuanHoa = s.toUpperCase();
		String[] words = chuanHoa.split(" ");

		System.out.print(words[words.length - 1]);
		for (int i = 0; i < words.length - 1; i++) {
			char x = words[i].toCharArray()[0];
			System.out.print(x);
		}
		System.out.print("@gmail.com");
	}
}
