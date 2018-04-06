package kr.co.koreait;

import static kr.co.koreait.Money.*;
import static kr.co.koreait.DrinkMachine.*;
import static kr.co.koreait.Main.my_inventory;

@SuppressWarnings("unused")
public class Main {
	static int my_inventory[] = {0,0,0,0};
	public static void main(String[] args) {
		System.out.println(MSG_1);
		Money.showMoneyList();
		DrinkMachine.MoneyInput();
		DrinkMachine.showMenu();
		DrinkMachine.buyMenu();
		DrinkMachine.inventory();
		System.out.println("\n"+MSG_2);
		System.out.println("\n남은돈: "+asset+"\n내가 산 음료");
		System.out.println("콜라:"+my_inventory[0]+"\n사이다:"+my_inventory[1]+"\n오란씨:"+my_inventory[2]+"\n포카리:"+my_inventory[3]);
	}
}
