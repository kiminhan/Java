//package inter;
//
//public class RepairableTest {
//	public static void main(String[] args) {
//		Tank tank = new Tank();
//		Dropship dropship = new Dropship();
//		
//		Marine marine = new Marine();
//		SCV scv = new SCV();
//		Medic medic = new Medic();
//		
//		scv.repair(tank); // scv가 tank를 수리하도록 한다.
//		scv.repair(dropship);
//		medic.rescue(marine);
////		scv.repair(marine); error
//	}
//}
//
//interface Repairable{}
//interface Rescue{}
//
//class Unit{
//	int hitPoint;
//	final int MAX_HP;
//	Unit(int hp){
//		MAX_HP = hp;
//	}
//	//...
//}
//
//class GroundUnit extends Unit{
//	GroundUnit(int hp){
//		super(hp);
//	}
//}
//
//class AirUnit extends Unit{
//	AirUnit(int hp){
//		super(hp);
//	}
//}
//
//class Tank extends GroundUnit implements Repairable{
//	Tank(){
//		super(150); // Tank의 HP는 150이다.
//		hitPoint = MAX_HP;
//	}
//	
//	public String toString() {
//		return "Tank";
//	}
//	//...
//}
//
//class Dropship extends AirUnit implements Repairable{
//	Dropship(){
//		super(125); // Dropship의 HP는 125이다.
//		hitPoint = MAX_HP;
//	}
//	
//	public String toString() {
//		return "Dropship";
//	}
//	//...
//}
//
//class Marine extends GroundUnit implements Rescue{
//	Marine(){
//		super(40);
//		hitPoint = MAX_HP;
//	}
//	public String toString() {
//		return "Marine";
//	}
//	//...
//}
//
//class SCV extends GroundUnit implements Repairable{
//	SCV(){
//		super(60); //
//		hitPoint = MAX_HP;
//	}
//	
//	void repair(Repairable r) {
//		if (r instanceof Unit) {
//			Unit u = (Unit)r;
//			while(u.hitPoint != u.MAX_HP) {
//				/* Unit의 Hp를 증가시킨다. */
//				u.hitPoint++;
//			}
//			System.out.println(u.toString() + "의 수리가 끝났습니다.");
//		}
//	}
//	//...
//}
//
//class Medic extends GroundUnit implements Rescue{
//	Medic(){
//		super(40); //
//		hitPoint = MAX_HP;
//	}
//	
//	void rescue(Rescue r) {
//		if (r instanceof Unit) {
//			Unit u = (Unit)r;
//			while(u.hitPoint != u.MAX_HP) {
//				/* Unit의 Hp를 증가시킨다. */
//				u.hitPoint++;
//			}
//			System.out.println(u.toString() + "의 치료가 끝났습니다.");
//		}
//	}
//	//...
//}
