package review;

import java.util.ArrayList;

public class CustomerTest3 {

	public static void main(String[] args) {
		ArrayList<Customer1> customerList = new ArrayList<Customer1>();
		
		Customer1 customerLee = new Customer1(10010, "이순신");
		Customer1 customerShin = new Customer1(10020, "신사임당");
		Customer1 customerHong = new GoldCustomer(10030, "홍길동");
		Customer1 customerYoul = new GoldCustomer(10040, "이율곡");
		Customer1 customerKim = new VIPCustomer1(10050, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("====== 고객 정보 출력 ======");
		for(Customer1 customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		int price = 10000;
		for(Customer1 customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이"
					+ cost + "원을 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는"
					+ customer.bonusPoint + "점입니다.");
		}

	}

}
