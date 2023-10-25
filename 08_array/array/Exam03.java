package array;

import java.util.Arrays;

public class Exam03 {
	public static void main(String[] args) {
		// 참조값 이해하기
		int[] score = new int[5];
		System.out.println(score);
		System.out.println(Arrays.toString(score));		
		
		double[] data = new double[4];
		System.out.println(data);
		System.out.println(Arrays.toString(data));		
	
		System.out.println("배열을 선언하면 자동으로 컴파일러가 데이터를 초기화하는데 정수는 0으로 실수는 0.0으로 초기화한다.");
	}
}
