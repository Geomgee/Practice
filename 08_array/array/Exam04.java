package array;

import java.util.Arrays;

public class Exam04 {
	public static void main(String[] args) {
		//배열 복사
		int[] ori = {1,2,3,4,5};
		System.out.println(ori);
		System.out.println(Arrays.toString(ori));
		
		int[] copy = ori;
		System.out.println(copy);
		System.out.println(Arrays.toString(copy));
		
		//배열 데이터 중에서 원하는 수만 추출하기 destination에 담기
//		int[] destination = new int[3];
//		for (int i=1; i<4; i++) {
//			destination[i-1]=ori[i];
//			System.out.println(destination[i-1]);
//		}
//		System.out.println(Arrays.toString(destination));
//		System.out.println();
		
//		
//		int[] destination = Arrays.copyOfRange(ori, 1, 4);
//		System.out.println(destination);
//		System.out.println(Arrays.toString(destination));
		
		int[] destination = Arrays.copyOfRange(ori, 1, 4);
		System.out.println(Arrays.toString(destination));
		System.out.println();
		int[] original = {0,1,2,3,4,5};
		int[] desti = {0,10,20,30,40,50};
		
		//original의 1번째부터 3개를 복사해서 desti의 2번째부터 바꿔라
		System.arraycopy(original, 2, desti, 2, 3);
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(desti));

		//{0,1,20,30,40,5}로 바꿔보세요
		System.arraycopy(desti, 1, original, 1, 4);
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(desti));
		
		
	}
}
		