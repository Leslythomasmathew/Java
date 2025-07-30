package JavaTut;
class PaymentGateWay{
	public static void makePayment(String cardNumber,String expiryDate,String CVV) {
		System.out.println("Thankyou!Your order is confirmed");
		System.out.println("Transaction is completed using credit card"+cardNumber);
		System.out.println();
	}
	public static void makePayment(String UPIID)
	{
		System.out.println("Thankyou!Your order is confirmed");
		System.out.println(" transaction is completed using UPI");
		System.out.println();
	}
	public static void makePayment(double amount) {
		System.out.println("Thankyou!Your order is confirmed ");		and you choose for Cash On Delivery ");
		
	}
}

public class ECommerceApp {
	
	public static void main(String[] args) {
		PaymentGateWay product= new PaymentGateWay();
		PaymentGateWay.makePayment("Card Number","ExpiryDate","CVV");
		upi=PaymentGateWay.makePayment("UPIID");
		COD=PaymentGateWay.makePayment(35000);
}

}
