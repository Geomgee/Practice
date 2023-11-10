package exam06;

public interface RemoteControl {
	// 인터페이스는 객체를 사용하는 사용설명서의 역할을 한다

	// 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 메소드
	void turnOn();

	void turnOff();

	void setVolume(int volume);
}
