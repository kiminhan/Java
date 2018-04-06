package kr.co.mission.util;

public class Utils {
	
	private Utils() {}
	
	public static void print(String str) {
		System.out.print(str);
	}

	public static void println(String str) {
		System.out.println(str);
	}
	
	public static void printfln(String str, int v) {
		System.out.printf(str + "\n", v);
	}	
}
