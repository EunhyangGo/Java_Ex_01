package com.biz.ex01;

public class GradeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gradeSum(80, 87, 95);
		
		
	}

	public static int gradeSum(int intKor, int intEng, int intMat) {
		// return을 intSum으로 받으려면 void가 아니라 int로 해야됨.
		intKor = 80 ; //변수는 의미있는 단어로 조합하기
		intEng = 87;
		intMat = 95;
		
		int intSum = intKor + intEng + intMat ;
		System.out.println(intSum);
		return intSum;
	}

}

