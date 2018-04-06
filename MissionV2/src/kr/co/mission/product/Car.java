package kr.co.mission.product;

import static kr.co.mission.util.Variable.*;

public class Car extends Product {
	final public static byte AVANTE = 0; 
	final public static byte SONATA = 1; 
	final public static byte GRANDURE = 2; 
	final public static byte GENESIS = 3; 
	
	public Car(byte type) {			
		switch(type) {
		case 0:
			setName(CAR1);
			setPrice(CAR1_PRICE);
			break;
		case 1:
			setName(CAR2);
			setPrice(CAR2_PRICE);
			break;
		case 2:
			setName(CAR3);
			setPrice(CAR3_PRICE);
			break;
		case 3:
			setName(CAR4);
			setPrice(CAR4_PRICE);
			break;
		}
	}
}
