package exam04;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void bell() { //�߻� Ŭ�������� �̿ϼ��� �޼ҵ� ���⼭ �ϼ�
		System.out.println("��ȭ������");
		
	}
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone(null);
		sp.bell();
	}

}