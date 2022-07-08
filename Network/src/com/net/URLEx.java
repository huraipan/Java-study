package com.net;
import java.io.*;
import java.net.*;
public class URLEx {

	public static void main(String[] args) {
		// URL (uniform resource locator)�� ���� ������ ������ �ִ� Ŭ����
		// ��������, ȣ��Ʈ��, ��Ʈ��ȣ, �ڿ��� ���, ������Ʈ������ ������ ����
		
		BufferedReader br = null;
		
		try {
		  URL url = new URL("http://www.daum.net/index.html");
		  System.out.println("��������: "+url.getProtocol());
		  System.out.println("ȣ��Ʈ: "+url.getHost());
		  System.out.println("��Ʈ��ȣ: "+url.getPort());
		  System.out.println("�ڿ��� ���: "+url.getPath());
		  
		  br = new BufferedReader(new InputStreamReader(url.openStream()));
		  String str = null;
		  while((str=br.readLine())!=null) {
			  System.out.println(str);
		  }
		  
		  
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try { if(br != null) br.close();}catch(IOException ee) {}
		}
		
		
		

	}

}
