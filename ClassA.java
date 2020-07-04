package InheritanceTypes;

public class ClassA {

	private String show;
	private int ticketAmount;

	public ClassA() {

		String show = "";
		int ticketAmount = 0;

		System.out.println("SupperClass - Constructor/method");

	}

	public ClassA(String showName, int ticketPrice) {

		this.show = showName;
		this.ticketAmount = ticketPrice;

	}

	public String getShow() {

		return show;
	}

	public int getticketAmount() {
		return ticketAmount;
	}

	public void setShow(String showName) {

		this.show = showName;

	}

	public void setticketAmount(int ticketPrice) {
		this.ticketAmount = ticketPrice;
	}

}
