package kr.co.koreait;

public class Money {
	static int price[] = {100,500,1000,5000,10000};
	static int i = 0;
	static int j = 0;
	public final static String MSG_1 = "[자판기 시작]";
	public final static String MSG_2 = "[프로그램 종료]";
	
	static void showMoneyList() {
		System.out.println("- 현금 주입 -");
		while(i<5) {
			i++;
			System.out.println(i+"."+ price[j]+"원");
			++j;
		}
		System.out.println("6.주입완료");
	}
}