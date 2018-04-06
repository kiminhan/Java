package kr.co.mission;

import static kr.co.mission.util.Utils.*;

import kr.co.mission.product.Product;

public class User {
	private int asset;
	private int idx = 0;
	private Product[] pList = new Product[50];
	
	public User(int asset) {
		this.asset = asset;
	}
	
	public int getAsset() {
		return asset;
	}
	
	public void displayProductList() {
		int sum = 0;		
		if(idx == 0) {
			return;
		}
		println("=================");
		/*for(Product p : pList) {
			if(p == null) {
				break;
			}			
			sum += p.getPrice();
			println(p.toString());
		}*/
		for(int i=0; i<idx;i++) {
			sum += pList[i].getPrice();
			println(pList[i].toString());
			//System.out.printf("%d\n", pList[i].hashCode()); //정수형 주소값 출력
		}
		println("=================");
		printfln("총 비용  : %,d", sum);
		printfln("남은 돈 : %,d", asset);
	}
	
	public void buyProduct(Product p) {
		if(p.getPrice() > asset) {
			printfln("금액이 부족합니다. (남은 돈 %,d원)", asset);			
		} else {			
			pList[idx++] = p;
			asset -= p.getPrice();
			this.displayProductList();
		}
	}
}
