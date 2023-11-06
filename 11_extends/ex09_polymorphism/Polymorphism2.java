package ex09_polymorphism;

class DrawData { // 부모 클래스
	private int height;
	private char outchar;

	// 오버라이드 용 메소드
	public void draw() {
	}

	public int getHeight() {
		return height;
	}

	public char getOutchar() {
		return outchar;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setOutchar(char outchar) {
		this.outchar = outchar;
	}

}

class IsoTriangle extends DrawData {
	@Override
	public void draw() {
		for (int i = 1; i < getHeight(); i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(getOutchar());
			}
			System.out.println();
		}
		System.out.println();
	}
}

class Pyramid extends DrawData {
	@Override
	public void draw() {
		for (int i = 1; i < getHeight() + 1; i++) {
			for (int j = 0; j <= getHeight() - i; j++) {
				System.out.print(" ");
			}
			for (int s = 0; s < (2 * i - 1); s++) {
				System.out.print(getOutchar());
			}
			System.out.println();
		}
		System.out.println();
	}
}

public class Polymorphism2 {
	public static void main(String[] args) {
		DrawData drawData = new Pyramid();
		drawData.setHeight(5);
		drawData.setOutchar('*');
		drawData.draw();
	}
}
