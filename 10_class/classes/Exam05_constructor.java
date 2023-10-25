package classes;

class Friend {
	String name;
	int age;

//	Friend() { // 기본 생성자 함수
//		// 개발자가 임의로 생성자함수를 만들지 않으면 자동으로 기본 생성자 함수가 생성되어 호출된다.
//		System.out.println(" ! 기본 생성자 함수 호출 ! ");
//	}

	Friend(String name) { // =>생성자 함수는 클래스명과 동일한 이름을 가지고 있는 함수이며 해당 클래스의 객체를 만듦면 자동으로 호출되는 함수이다.
		System.out.println("매개변수 있는 생성자 함수가 호출");
		this.name = name; // this 는 Friend 클래스 자체를 의미
//		this.name = "박효지"; // this 는 Friend 클래스 자체를 의미
		age = 5;
	}

	void printFriend() {
		System.out.println("내 친구 " + name + "은(는) 나이가 " + age + "세이다.");
	}
}

public class Exam05_constructor { // constructor : 생성자 함수
	public static void main(String[] args) {
		Friend friend = new Friend("박효지"); // new 기본 생성자함수() 호출하여 객체를 생성할 수 있다.
//		friend.name = "박효지";
//		friend.age = 29;
		friend.printFriend();

	}
}
