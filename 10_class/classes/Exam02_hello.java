package classes;

class HelloWorld {
	String message;

	void setEng() {
		message = "Hello java";
	}

	void setKor() {
		message = "안녕 자바";
	}

	void sayHello() {
		System.out.println(message);
	}
}

public class Exam02_hello {
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();

		helloWorld.setEng();
		helloWorld.sayHello();

		helloWorld.setKor();
		helloWorld.sayHello();

		helloWorld.sayHello();
	}

}