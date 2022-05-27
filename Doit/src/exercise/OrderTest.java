package exercise;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderNum = 201803120001l;
		order.userID = "abc123";
		order.orderYear = 2018;
		order.orderMonth = 3;
		order.orderDay = 12;
		order.name = "홍길순";
		order.productNum = "PD0345-12";
		order.adress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println(order.getOrderNum());
		System.out.println(order.getUserID());
		System.out.println(order.getOrderYear()+"년"+order.getOrderMonth()+"월"+order.getOrderDay()+"일");
		System.out.println(order.getName());
		System.out.println(order.getProductNum());
		System.out.println(order.getAdress());

	}

}
