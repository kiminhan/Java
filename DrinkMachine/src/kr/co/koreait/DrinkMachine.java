package kr.co.koreait;

import static kr.co.koreait.Money.price;
import static kr.co.koreait.Main.*;

import java.util.Scanner;

public class DrinkMachine {
	static final String product[] = {"콜라","사이다","오란씨","포카리"};
	static final int product_price[] = {600,600,700,700};
	static int product_inventory[] = {50,50,50,50};
	static int choice = 0;
	static int coin = 0;
	static int asset = 0;
	
	static void MoneyInput() {
		while(true) {
			System.out.print("입금 선택: ");
			@SuppressWarnings("resource")
			Scanner number = new Scanner(System.in);
			coin = number.nextInt();
			if (coin == 1) {
				asset += price[0];
				System.out.println("입금액: "+ asset);
			}
			else if (coin == 2) {
				asset += price[1];
				System.out.println("입금액: "+ asset);
			}
			else if (coin == 3) {
				asset += price[2];
				System.out.println("입금액: "+ asset);
			}
			else if (coin == 4) {
				asset += price[3];
				System.out.println("입금액: "+ asset);
			}
			else if (coin == 5) {
				asset += price[4];
				System.out.println("입금액: "+ asset);
			}
			else if (coin == 6) {
				System.out.println("총 입금액: "+ asset);
				break;
			}
		}	
	}
	
	static void showMenu() {
		System.out.println("- 메뉴 - ");
		for(int i=1; i<(product.length+1); i++) {
			System.out.println(i+". "+product[i-1]+"-"+product_price[i-1]+"원");
		}
		System.out.println("5. 종료");
	}
	static void buyMenu() {
		while(true) {
			System.out.print("메뉴 선택 : ");
			@SuppressWarnings("resource")
			Scanner menu_choice = new Scanner(System.in);
			choice = menu_choice.nextInt();
			if (choice == 1) {
				if(product_inventory[0] == 0) {
					System.out.println("재고가 부족합니다. 죄송합니다.");
				}
				else if (asset >= product_price[0]) {
					System.out.println(product[0]+"-"+product_price[0]);
					asset -= product_price[0];
					System.out.println("남은돈 "+ asset+"원");
					product_inventory[0] -= 1;
					my_inventory[0] += 1;
				}
				else {
					System.out.println("금액이 부족하여 구매할 수 없습니다.");
				}
			}
			else if (choice == 2) {
				if(product_inventory[1] == 0) {
					System.out.println("재고가 부족합니다. 죄송합니다.");
				}
				else if (asset >= product_price[1]) {
					System.out.println(product[1]+"-"+product_price[1]);
					asset -= product_price[1];
					System.out.println("남은돈 "+ asset+"원");
					product_inventory[1] -= 1;
					my_inventory[1] += 1;
				}
				else {
					System.out.println("금액이 부족하여 구매할 수 없습니다.");
				}
			}
			else if (choice == 3) {
				if(product_inventory[2] == 0) {
					System.out.println("재고가 부족합니다. 죄송합니다.");
				}
				else if (asset >= product_price[2]) {
					System.out.println(product[2]+"-"+product_price[2]);
					asset -= product_price[2];
					System.out.println("남은돈 "+ asset+"원");
					product_inventory[2] -= 1;
					my_inventory[2] += 1;
				}
				else {
					System.out.println("금액이 부족하여 구매할 수 없습니다.");
				}
			}
			else if (choice == 4) {
				if(product_inventory[3] == 0) {
					System.out.println("재고가 부족합니다. 죄송합니다.");
				}
				else if (asset >= product_price[3]) {
					System.out.println(product[3]+"-"+product_price[3]);
					asset -= product_price[3];
					System.out.println("남은돈 "+ asset+"원");
					product_inventory[3] -= 1;
					my_inventory[3] += 1;
				}
				else {
					System.out.println("금액이 부족하여 구매할 수 없습니다.");
				}
			}
			else if (choice == 5) {
				break;
			}
		}
	}
	static void inventory() {
		System.out.println("\n- 재고 출력 - ");
		for (int i=0; i<product_inventory.length; i++) {
			System.out.println(product[i]+" "+product_inventory[i]);
		}
	}
}