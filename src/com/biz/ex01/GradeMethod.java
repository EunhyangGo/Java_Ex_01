package com.biz.ex01;

public class GradeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gradeSum(80, 87, 95);
		
		
	}

	public static int gradeSum(int intKor, int intEng, int intMat) {
		// return�� intSum���� �������� void�� �ƴ϶� int�� �ؾߵ�.
		intKor = 80 ; //������ �ǹ��ִ� �ܾ�� �����ϱ�
		intEng = 87;
		intMat = 95;
		
		int intSum = intKor + intEng + intMat ;
		System.out.println(intSum);
		return intSum;
	}

}

