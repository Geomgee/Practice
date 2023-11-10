package exam05_selfEX;

public class SoundableExample {
	public static void printSound(Soundable soundable) { // 부모를 참조타입으로 만들어서
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Dog());
		printSound(new Cat());
	}
}
