package com.ioex;
import java.io.*;
public class PrintWriterEx {

	public static void main(String[] args) {
		
		
		
		
		PrintWriter pw = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		
		
		try {
			fos = new FileOutputStream("c:/pop/printwriter.txt");
			bos = new BufferedOutputStream(fos);
			pw = new PrintWriter(bos, true);
			
			
			
			pw.println("오늘도 즐거운 !!");
			pw.println("점심 시간이 찾아 왔습니다.");
			pw.println(100.0);
			pw.println(true);
			
			
			
			
			
		}catch (FileNotFoundException fnfe) {	
				fnfe.printStackTrace();
			
		}catch (IOException ii) {
			ii.printStackTrace();
		}finally {
			try {
				if(fos != null) {fos.close();}
				if(pw != null) {pw.close();}
				if(bos != null) {bos.close();}
				
		}catch (IOException e) {}
			
		}

	}

}
