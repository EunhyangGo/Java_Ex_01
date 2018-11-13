package com.biz.ex01;

public class MethodSum01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(retSum(50)); 
		// 50이란값이 지정되었고 바로 콘솔에 표시하려면 sysout을 통해 나타내면 됨.
	}

	public static int retSum(int intNum) {
		return intNum + 100;
	}
}
