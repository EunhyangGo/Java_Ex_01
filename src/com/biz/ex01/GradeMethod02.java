package com.biz.ex01;

public class GradeMethod02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intKor = 99;
		int intEng = 87;
		int intMat = 88;
		int intScien = 89;
		
		//main���� ����� ������ gradeSum()���� ��� ��Ű��
		int intSum = gradeSum(intKor, intEng, intMat, intScien);
		
		float floAvg = intSum / 4;
		System.out.println(floAvg);

	}
	
	public static int gradeSum(int intKor, int intEng, int intMat, int intScien) {
		int intSum = intKor + intEng + intMat+ intScien;
		return intSum;
				
		
	}

}
