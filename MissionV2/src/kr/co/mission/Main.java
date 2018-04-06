package kr.co.mission;

import static kr.co.mission.util.Utils.print;
import static kr.co.mission.util.Utils.println;
import static kr.co.mission.util.Variable.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import kr.co.mission.product.Car;
import kr.co.mission.product.Dryer;
import kr.co.mission.product.Product;
import kr.co.mission.product.Tv;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User user = null;
		int tempAsset = 0;
		int pChoice = -2;		
		
		do {			
			if(user == null) {
				print(MSG_1);		
			} 			
			tempAsset = scan.nextInt();			
			if(tempAsset >= 500) {
				user = new User(tempAsset);
			} else {
				println(MSG_2);
			}
		}while(user == null);
		
		/*
		final String name = "name";
		final String price = "price";

		ArrayList<HashMap> a = new ArrayList<HashMap>();
		
		HashMap hs = new HashMap();
		hs.put("name", "TV 13인치");
		hs.put("price", TV1_PRICE);
		hs.put(1, TV1_PRICE);
		hs.put(2, TV2_PRICE);
		hs.put(2, TV3_PRICE);
		
		
		System.out.println("asdfasdfs" + hs.get("name"));
		System.out.println("asdfasdfs" + hs.get("price"));
		System.out.println("asdfasdfs" + hs.get(1));
		System.out.println("asdfasdfs" + hs.get(2));
		
		
		a.add(hs);
		
		hs = new HashMap();
		hs.put(name, "TV 15인치");
		hs.put(price, TV2_PRICE);		
		a.add(hs);
		
		hs = new HashMap();
		hs.put(name, "TV 20인치");
		hs.put(price, TV3_PRICE);
		a.add(0, hs);
		
		
		for(int i=0; i<a.size(); i++) {
			HashMap b = (HashMap)a.get(i);
			System.out.printf(MSG_4, (i+1), b.get(name), b.get(price));
		}
		*/
		println(MSG_3);
		println("-------------------------------------");
		int min = PRODUCT_PRICE_LIST[0];
		for(int i=0; i<PRODUCT_LIST.length; i++) {
			System.out.printf(MSG_4, (i+1), PRODUCT_LIST[i], PRODUCT_PRICE_LIST[i]);
			if(min >PRODUCT_PRICE_LIST[i]) {
				min = PRODUCT_PRICE_LIST[i];
			}
		}		
		println("-------------------------------------");
		
		Product p;
		
		do {
			p = null;	
			print(MSG_5);
			pChoice = scan.nextInt();
			switch(pChoice) {
			case 1:
				p = new Tv(Tv.TV_13);
				break;
			case 2:
				p = new Tv(Tv.TV_15);
				break;
			case 3:
				p = new Tv(Tv.TV_20);
				break;
			case 4:
				p = new Dryer();
				break;
			case 5:
				p = new Car(Car.AVANTE);
				break;
			case 6:
				p = new Car(Car.SONATA);
				break;
			case 7:
				p = new Car(Car.GRANDURE);
				break;
			case 8:
				p = new Car(Car.GENESIS);
				break;			
			}
			if(p != null) {
				user.buyProduct(p);
			}
		}while(pChoice != 0 && user.getAsset() >= min);
		println("프로그램 종료");		
	}
}
