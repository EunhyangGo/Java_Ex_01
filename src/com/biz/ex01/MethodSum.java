package com.biz.ex01;

public class MethodSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int retNum = retSum(50);
		System.out.println(retNum);
		

		
	}
	public static int retSum(int intNum) {
	
		//void�� retsum����� �˾Ƽ� ó���϶�� �ϴ°Ű�
		//void�� return������ ���� ������ ���� ���� �ٸ���.
		intNum = intNum + 100;
		intNum += 100; // �����Ŷ� �Ȱ��� ��. intNum�� 100�� ���ض�.
//		System.out.println(intNum);
		
	return intNum ; //intNum�� ���� ������մ°��� main �޼��忡�� ������.
	

	}

}
