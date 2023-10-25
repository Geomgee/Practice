package array;

import java.util.Arrays;
import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		int[] data = {1,3,5,7,9};
		
		//결과값 : 1 3 5 7 9를 출력하세요
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}

		System.out.println();
		System.out.println("===============");
		//향상된 for문을 활용하여 배열의 값을 출력하기
		for(int x : data) {
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("===============");
		//향상된 for문을 활용하여 data 배열 데이터에서 3의 배수만 출력하세요.
		
		for(int x : data) {
			System.out.print(3*x+" ");
	
		}
	}	
}
		