package exam06;

class Account {
	private int balance;
	private String name, ano;

	Account(String name, String ano, int balance) {
		this.ano = ano;
		this.balance = balance;
		this.name = name;
	}

	public String getAccount() {
		return ano;
	}

	public void setAccount(String ano) {
		this.ano = ano;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}

public class AccountEx {

	public static void main(String[] args) {
	  	   int menu = 0;
	   while(menu != 5) {
		   System.out.println("| 1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ���� |");
           
	   }

	}

}
