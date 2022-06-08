package boardex;


import java.util.ArrayList;
import java.util.Scanner;
public class BoardSVC {
	
	ArrayList<BoardVO> boardList;
	
	public BoardSVC() {
		boardList = new ArrayList<BoardVO>();
	}
	
	//�۾���
	public void writeArticle(Scanner sc) {
		System.out.println("�Խ��� ���� �ۼ� �ϼ���.");
		System.out.print("�ۼ���: ");
		String register = sc.next();
		System.out.print("�̸���: ");
		String email = sc.next();
		System.out.print("��й�ȣ: ");
		String passwd = sc.next();
		System.out.print("����: ");
		String subject = sc.next();
		System.out.print("�۳���: ");
		String content = sc.next();
		
		BoardVO boardVO = new BoardVO(register, subject, email, content, passwd);
		//ArrayList�� �߰�
		addArticle(boardVO);
	}
	//���� ����Ʈ�� �߰�
	private void addArticle(BoardVO boardVO) {
		boardList.add(boardVO);
	}
	
	
	//��� ����
	public void listArticle(Scanner sc) {
		
		if(boardList.size()>0) {
			
			for(int i=0;i<boardList.size();i++) {
				System.out.println(boardList.get(i));
			}
		}else {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
		}
		
	}
	
	
	
	//�ۻ���
	
	public void removeArticle(Scanner sc) {
		
		System.out.println("�Խñ��� �����Ҷ��� ���� �ۼ��ڿ� ��й�ȣ�� �Է��ϼ���.");
		System.out.print("�ۼ���: ");
		String name = sc.next();
		System.out.print("��й�ȣ: ");
		String passwd = sc.next();
		
		removeArticle(name,passwd);
	}

	private void removeArticle(String register, String passwd) {
		// ���� ��� ����
		
		if(boardList.size()>0) {
			
			int index =-1;
			
			for(int i=0;i<boardList.size();i++) {
				
				if(boardList.get(i).getRegister().equals(register)) {
					if(boardList.get(i).getPasswd().equals(passwd)) {
						boardList.remove(boardList.get(i));
						index = i;
					}
				}
				
			}
			if(index == -1) { // �ε����� ���� ���
			     System.out.println("�ش� �ۿ� �ۼ��ڰ� ���ų� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			     return;
			}
		}else {
			System.out.println("��ϵ� �Խñ��� �����ϴ�.");
		}
		
	}
	
	
	

}
