package exam07;

class DmbCellPhone extends CellPhone {
	int channel;

	DmbCellPhone(String model, String color, int channel) {

		this.model = model;
		this.color = color;
		// super("Bmodel","yellow");
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� ����� �����մϴ�.");
	}

	void changeChannelDmb(int channel) {
		System.out.println("ä�� " + channel + "������ �ٲ�");
	}

	void turnoffDmb() {
		System.out.println("DMB ����");
	}
}

public class DmbCellPhoneEX {
	public static void main(String[] args) {
		DmbCellPhone d1 = new DmbCellPhone("Amodel", "pink", 22);

		System.out.println("�𵨸� : " + d1.model);
		System.out.println("���� : " + d1.color);
		System.out.println("ä�� : " + d1.channel);

		d1.poweron();
		d1.bell();
		d1.sendvoice("��������");
		d1.receivevoice("�����ε���");
		d1.sendvoice("�� �ݰ����ϴ�.");
		d1.receivevoice("�̸� �����Կ�.");
		d1.hangup();
		d1.turnOnDmb();
		d1.changeChannelDmb(27);
		d1.turnoffDmb();

	}

}
