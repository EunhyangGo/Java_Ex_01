package com.biz.ex01;

public class GradeMethod03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int intKor = makeGrade();
		int intEng = makeGrade();
		int intMath = makeGrade();
		int intSci =makeGrade();
		
		int intSum = gradeSum(intKor,intEng);
		intSum +=gradeSum(intMath, intSci);
		System.out.printf("����: " + intKor + " ,");
		System.out.printf("����: " + intEng+ " ,");
		System.out.printf("����: " + intMath+ " ,");
		System.out.printf("����: " + intSci+ " ,");
		System.out.println("����: " + intSum+ " ,");
		//����� ��Ȯ�� ����ϱ� ���ؼ� ������ float������ ��ȯ�ϰ� /4�� ����ؼ� ǥ��
		System.out.println("��� : " + ((float)intSum/4));
	}
		
		
	
		public static int makeGrade() {
	
			int intGrade = (int)(Math.random() * (100-50+1)) +50;
			return intGrade;
	}
		public static int gradeSum(int intNum1, int intNum2) {
			return intNum1 + intNum2 ;
		}

}
