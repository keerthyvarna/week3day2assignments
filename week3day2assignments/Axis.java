package week3day2assignments;

public class Axis extends BankInfo{
	public void deposit() {
		
		System.out.println("Deposit Rs.3 lakhs");
	}
	

	public static void main(String[] args) {
		Axis axis = new Axis();
		axis.saving();
		axis.fixed();
		axis.deposit();

	}

}
