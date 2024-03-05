
public class DebitCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billamt) {
		System.out.println("Debit card payment processed..");
		return true;
	}

}
