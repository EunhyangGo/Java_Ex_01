package com.biz.ex01;

public class MethodSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int retNum = retSum(50);
		System.out.println(retNum);
		

		
	}
	public static int retSum(int intNum) {
	
		//void는 retsum결과를 알아서 처리하라고 하는거고
		//void는 return다음에 오는 형태의 값에 따라 다르다.
		intNum = intNum + 100;
		intNum += 100; // 위에거랑 똑같은 말. intNum에 100을 더해라.
//		System.out.println(intNum);
		
	return intNum ; //intNum에 현재 저장되잇는값을 main 메서드에게 보내긔.
	

	}

}
