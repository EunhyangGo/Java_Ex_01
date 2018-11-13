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
		System.out.printf("국어: " + intKor + " ,");
		System.out.printf("영어: " + intEng+ " ,");
		System.out.printf("수학: " + intMath+ " ,");
		System.out.printf("과학: " + intSci+ " ,");
		System.out.println("총점: " + intSum+ " ,");
		//평균을 정확히 계산하기 위해서 총점을 float형으로 변환하고 /4를 계산해서 표시
		System.out.println("평균 : " + ((float)intSum/4));
	}
		
		
	
		public static int makeGrade() {
	
			int intGrade = (int)(Math.random() * (100-50+1)) +50;
			return intGrade;
	}
		public static int gradeSum(int intNum1, int intNum2) {
			return intNum1 + intNum2 ;
		}

}
