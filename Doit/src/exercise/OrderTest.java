package exercise;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderNum = 201803120001l;
		order.userID = "abc123";
		order.orderYear = 2018;
		order.orderMonth = 3;
		order.orderDay = 12;
		order.name = "ȫ���";
		order.productNum = "PD0345-12";
		order.adress = "����� �������� ���ǵ��� 20����";
		
		System.out.println(order.getOrderNum());
		System.out.println(order.getUserID());
		System.out.println(order.getOrderYear()+"��"+order.getOrderMonth()+"��"+order.getOrderDay()+"��");
		System.out.println(order.getName());
		System.out.println(order.getProductNum());
		System.out.println(order.getAdress());

	}

}
