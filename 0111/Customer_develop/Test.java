package Customer_develop;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerC = new GoldCustomer(1000, "Chae");
		Customer customerL = new VIPCustomer(1001, "Lee");
		Customer customerI = new VIPCustomer(1002, "Im");
		Customer customerY = new Customer(1003, "Yoo");
		Customer customerS = new Customer(1004, "Son");
		
		customerList.add(customerC);
		customerList.add(customerL);
		customerList.add(customerI);
		customerList.add(customerY);
		customerList.add(customerS);
		
//		for (Customer customer : customerList) {
//			System.out.println(customer.showCustomerInfo());
//		}
//		
//		int price = 10000;
//		for(Customer customer : customerList) {
//			int cost = customer.calcPrice(price);
//			System.out.println(customer.getCustomerName()+"���� " + cost + "�� ����");
//			System.out.println(customer.getCustomerName()+"���� ���� ����Ʈ�� " + customer.bonusPoint + "��");
//		}
		if(customerI instanceof VIPCustomer) {
			VIPCustomer vc = (VIPCustomer)customerI;
			System.out.println(customerI.showCustomerInfo());
		}
		
	}


}
