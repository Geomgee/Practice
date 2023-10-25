package array;

public class Exam09 {
	public static void main(String[] args) {

		// 가변 배열
		int[][] data = new int[4][]; // 행의 길이만 명시
		
		data[0] = new int[4];
		data[1] = new int[3];
		data[2] = new int[2];
		data[3] = new int[1];
	
		System.out.println(data);
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				System.out.print(data[i][j]+"");
			}
			System.out.println();
		}
	}
}
