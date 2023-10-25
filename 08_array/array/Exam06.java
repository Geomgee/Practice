package array;

import java.util.Arrays;
import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		int[] a= new int[3];
		a[0] = 5;
		System.out.println(a[0]);
		System.out.println(Arrays.toString(a));
		
		System.out.println("====================");

		int[] b= a;
		System.out.println(b);
		System.out.println(Arrays.toString(b));
		
		System.out.println("====================");
		
		a[1]=10;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		System.out.println("====================");

		b[2]=20;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		System.out.println(a==b);
	}
}
		