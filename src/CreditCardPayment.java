
public class CreditCardPayment implements IPayment{

	@Override
	public boolean processPayment(double billamt) {
		System.out.println("credit card payment processed...");
		return true;
	}

	

}
