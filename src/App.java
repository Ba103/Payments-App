
public class App {
	
	public static void main(String[] args) {
		
		IPayment payment = new CreditCardPayment();
		IPayment payment1 = new DebitCardPayment();
		PaymentServies service= new PaymentServies(payment);
		
		service.setPayment(payment1);
		service.doPayment(200.00);
	}

}
