package classes;

import java.util.Scanner;

class Triangle {
	int base;
	int height;

	Triangle() {
	} // 기본 생성자

	Triangle(int base, int height) {
		this.base = base;
		this.height = height;

	}

	void setTriangle(int base, int height) {
		Scanner sc = new Scanner(System.in);

		double base, height;
		System.out.println("***삼각형 넓이 구하기***");
		base = sc.nextInt();
		System.out.println("밑변 : ");
		height = sc.nextDouble();
		System.out.println("삼각형의 넓이: " + (base * height / 2));
		sc.close();
	}

	double getArea() {
//		System.out.println("삼각형의 넓이: "+);
		return (base * height / 2);
	}
}