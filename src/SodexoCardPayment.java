
public class SodexoCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billamt) {
		System.out.println("Sodexo card payment processed..");
		return true;
	}

}
