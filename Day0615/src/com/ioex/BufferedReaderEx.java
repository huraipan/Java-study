package com.ioex;
import java.io.*;
public class BufferedReaderEx {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedReader br = null;
		InputStreamReader isr = null;
		
		
		
		
		
		
		
		try {
			
			
			
			fis = new FileInputStream("c:/pop/hello.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			
			//�� ���ξ� �о���� ���ڿ��� ������ ��������
			String str = null;
			
			//readLine() ���๮�ڸ� ������ ���๮�� ���������� ���ڿ��� ��ȯ�ϰ�
			// ��Ʈ���� ���� �����ϸ� null�� ��ȯ��
			
			while((str = br.readLine()) !=null) {
				System.out.println(str);
			}
			
			
			
			
			
			
		}catch (FileNotFoundException fnfe) {	
			fnfe.printStackTrace();
		}catch (IOException ii) {
			ii.printStackTrace();
		}finally {
			try {if(fis !=null) fis.close();}catch(IOException e) {}
			try {if(isr !=null) isr.close();}catch(IOException e) {}
			try {if(br !=null) br.close();}catch(IOException e) {}
		}

	}

}
