package exam07;

public class CellPhone {
   String model, color;
   
 

void poweron() {System.out.println("������ ��");
	};

	void poweroff() {
		System.out.println("������ ��");
	};

	void bell() {
		System.out.println("���� �︲");
	};

	void sendvoice(String message) {
		System.out.println("�ڽ� : " + message);
	}

	void receivevoice(String message) {
		System.out.println("���� : " + message);
	}

	void hangup() {
		System.out.println("��ȭ�� ����");
	}
}
