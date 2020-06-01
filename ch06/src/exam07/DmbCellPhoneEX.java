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
		System.out.println("채널 " + channel + "번 방송을 시작합니다.");
	}

	void changeChannelDmb(int channel) {
		System.out.println("채널 " + channel + "번으로 바꿈");
	}

	void turnoffDmb() {
		System.out.println("DMB 종료");
	}
}

public class DmbCellPhoneEX {
	public static void main(String[] args) {
		DmbCellPhone d1 = new DmbCellPhone("Amodel", "pink", 22);

		System.out.println("모델명 : " + d1.model);
		System.out.println("색상 : " + d1.color);
		System.out.println("채널 : " + d1.channel);

		d1.poweron();
		d1.bell();
		d1.sendvoice("누구세용");
		d1.receivevoice("고은인데요");
		d1.sendvoice("예 반갑습니다.");
		d1.receivevoice("이만 끊을게요.");
		d1.hangup();
		d1.turnOnDmb();
		d1.changeChannelDmb(27);
		d1.turnoffDmb();

	}

}
