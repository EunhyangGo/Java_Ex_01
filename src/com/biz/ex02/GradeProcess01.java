package com.biz.ex02;

public class GradeProcess01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intKor = 88;
		int intEng = 99;
		int intMath = 77;
		int intSci = 98;
		int intHis = 78; //�غ��� �ҿ����

		intKor = (int)(Math.random() * (100-50+1)) + 50;
		intEng = scoreMake();
		intMath = scoreMake();
		intSci = scoreMake();
		intHis = scoreMake();
		
		int intSum = intKor + intEng 
				+ intMath + intSci + intHis;
		float floatAvg = (float)intSum / 5;
		floatAvg = intSum / 5.0f;
		
		System.out.println("����:" + intKor);
		System.out.println("����:" + intEng);
		System.out.println("����:" + intMath);
		System.out.println("����:" + intSci);
		System.out.println("����:" + intHis);
		
		System.out.println("����:" + intSum);
		System.out.println("���:" + floatAvg);
		
		System.out.printf("����: %d, ���: %e"
				, intSum, floatAvg);
		
	}
	
	public static int scoreMake() {
		return (int)(Math.random() * (100-50+1)) + 50;
	}


}
