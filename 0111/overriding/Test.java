package overriding;

public class Test {

	public static void main(String[] args) {
		
		int price;
		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̳���");
		customerLee.setCustomerID(1001);
		customerLee.bonusPoint = 1000;
		price = customerLee.calcPrice(1000);		
		System.out.println(customerLee.showCustomerInfo()+price);
		
		VIPCustomer customerKwon = new VIPCustomer();
		customerKwon.setCustomerName("����");
		customerKwon.setCustomerID(1004);
		customerKwon.bonusPoint = 10000;
		price = customerKwon.calcPrice(1000);		
		System.out.println(customerKwon.showCustomerInfo() + price);
		
	}

}
