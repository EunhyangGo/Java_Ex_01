package com.biz.ex02;

public class GradeProcess02_00 {
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
			int intKor = (int)(Math.random() * (100-50+1)) + 50;
			int intEng = (int)(Math.random() * (100-50+1)) + 50;
			int intMath = (int)(Math.random() * (100-50+1)) + 50;
			int intSci = (int)(Math.random() * (100-50+1)) + 50;
			int intHis = (int)(Math.random() * (100-50+1)) + 50;
			
			int intSum = intKor + intEng + intMath 
					+ intSci + intHis;
			
			float floatAvg = (float)intSum / 5;
			System.out.println("����:" + intSum);
			System.out.println("���:" + floatAvg);
		}
		

	}

}
