package Inheritance;

public class Test {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerName("ÀÌ³ª´Ù");
		customerLee.setCustomerID(1001);
		customerLee.bonusPoint = 10000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKwon = new VIPCustomer();
		customerKwon.setCustomerName("±ÇÇó");
		customerKwon.setCustomerID(1004);
		customerKwon.bonusPoint = 1000000;
		System.out.println(customerKwon.showCustomerInfo());
		
	}

}
