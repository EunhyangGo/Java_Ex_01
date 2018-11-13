package com.biz.ex01;

public class GradeMethod01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intKor = 80;
		int intEng = 70;
		int intMat = 95;
		int intScien = 88;
		float floAvg = gradeSum(intKor, intEng, intMat, intScien);
		System.out.println(floAvg);
		
		
		
		
	}
	public static float gradeSum(int intKor, int intEng, int intMat, int intScien) {
	
		
		
		float floAvg = ((intKor + intEng + intMat + intScien)/4);
		return floAvg;
		
	}

}
