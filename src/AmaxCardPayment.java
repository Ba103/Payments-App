
public class AmaxCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billamt) {
		System.out.println("Amax card payment processed... ");
		return true;
	}

}
