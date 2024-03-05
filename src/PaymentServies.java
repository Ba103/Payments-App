
public class PaymentServies {

	private IPayment payment;

	public PaymentServies(IPayment payment) {
		this.payment=payment;
	}
	
	public void setPayment(IPayment payment) {
		this.payment=payment;
	}
	public void doPayment(double billamt) {
		boolean status=payment.processPayment(billamt);
		if(status) {
			System.out.println("payment success..");
			
		}else {
			System.out.println("Payment Declined..");
		}
	}
}
