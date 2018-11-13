package com.biz.ex01;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i = 2; i <=9; i++) {
				Gugudan(i);
		
	}
	}
	public static void Gugudan(int intDan) {
		System.out.println(intDan+"´Ü");
		for(int j = 1; j <=9; j++) {
			
			System.out.printf("%d * %d = %d\n", intDan,j,intDan*j);
			}
		System.out.println("================");
	}
}
	
	
/*	public static void Gogudan(int intDan) {
		System.out.println(intDan +"´Ü");
		for(int i =1; i <=9; i++) {
			System.out.printf("%d x %d = %d\n",intDan, i, intDan *i);
		}
		System.out.println("==================");
	}
	}
*/

