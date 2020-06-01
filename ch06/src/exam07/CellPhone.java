package exam07;

public class CellPhone {
   String model, color;
   
 

void poweron() {System.out.println("전원을 켬");
	};

	void poweroff() {
		System.out.println("전원을 끔");
	};

	void bell() {
		System.out.println("벨이 울림");
	};

	void sendvoice(String message) {
		System.out.println("자신 : " + message);
	}

	void receivevoice(String message) {
		System.out.println("상대방 : " + message);
	}

	void hangup() {
		System.out.println("전화를 끊음");
	}
}
