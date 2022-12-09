package HOC_CODE;

import java.util.Scanner;

public class RutTien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int money = sc.nextInt();
		int sum100 = money, sum50, sum20, sum10;
	    double tien_thua = n - (money + money*0.01);
		if(money > n) {
			System.out.println("so du khong kha dung");
		}
		else {
			int count100 = 0;
			while(sum100 >= 100000) {
				sum100 -= 500000;
				count100++;
			}
			sum50 = money - count100*100000;
			int count50 = 0;
			while(sum50 >= 50000) {
				sum50 -= 50000;
				count50++;
			}
			sum20 = money - count100*100000- count50*50000;
			int count20 = 0;
			while(sum20 >= 20000) {
				sum20 -= 20000;
				count20++;
			}
			sum10 = money - count100*100000- count50*50000 - count20*20000;
			int count10 = 0;
			while(sum10 >= 10000) {
				sum10 -= 10000;
				count10++;
			}
			System.out.println(count100+ " 100000");
			System.out.println(count50+ " 50000");
			System.out.println(count20+ " 20000");
			System.out.println(count10+ " 10000");
			System.out.println("tien thua cua ban "+ tien_thua);
			System.out.println("fee bank " + money*0.01);
		}
	}
}
