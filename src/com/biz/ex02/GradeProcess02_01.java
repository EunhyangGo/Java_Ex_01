package com.biz.ex02;

public class GradeProcess02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for ���� ���۵Ǳ� ���� ����Ǵ� ������
		 * for ���� ���� ������ �� ���� ����(�б�)����
		 * �뵵�� ���ǳ�
		 * ���� �ڵ忡���� for ���� ���� ������
		 * �� ������ ������ ������ ���� ����.
		 * �׷���, ���� for���� ���۵Ǳ� ����
		 * �� ������ ������ ������ �ʿ䰡 ����.
		int intKor;
		int intEng;
		int intMath;
		int intSci;
		int intHis;
		*/
		
		for(int i = 0 ; i < 5 ; i++) {
			int intKor = makeScore(); 
			int intEng = makeScore();
			int intMath = makeScore();
			int intSci = makeScore();
			int intHis = makeScore();
			
			int intSum = gradeSum(intKor, intEng,
					intMath, intSci, intHis);
			
			float floatAvg = (float)intSum / 5;
			System.out.println((i+1) + "���л��� ����");
			System.out.println("����:" + intSum);
			System.out.println("���:" + floatAvg);
		}
	}
	
	public static int gradeSum(int intKor, int intEng,
			int intMath, int intSci, int intHis) {

		return intKor + intEng + intMath 
		+ intSci + intHis;
	}
	
	public static int makeScore() {
		return (int)(Math.random() * (100-50+1)) + 50;
	}
	}

