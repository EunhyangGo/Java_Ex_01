package com.biz.ex02;

public class GradeProcess02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 5���� �л� ���� ���
		for(int intNum = 0; intNum < 5 ; intNum++) {
			processGrade(intNum+1);
		}
	}
	
	public static void processGrade(int intNum) {
		System.out.println("===================");
		System.out.println(intNum +"�� �л�");
		System.out.println("-------------------");
		int intKor = makeScore();
		int intEng = makeScore();
		int intMath = makeScore();
		int intSci = makeScore();
		int intHis = makeScore();
		
		System.out.printf("��������: %d\n",intKor);
		System.out.printf("��������: %d\n",intEng);
		System.out.printf("��������: %d\n",intMath);
		System.out.printf("��������: %d\n",intSci);
		System.out.printf("��������: %d\n",intHis);
		System.out.println("-------------------");
		
		makeSum(intKor,intEng,intMath,intSci,intHis);
	}
	
	public static void makeSum(int intKor, int intEng,
			int intMath, int intSci, int intHis) {
		int intSum = intKor + intEng
				+ intMath + intSci + intHis;
		System.out.println("����:" + intSum);
		
		makeAvg(intSum);
	}
	
	public static void makeAvg(int intSum) {
		float intAvg = (float)intSum / 5;
		System.out.println("���:" + intAvg);
	}
	
	public static int makeScore() {
		return (int)(Math.random() * (100-50+1)) + 50;
	}
	}

