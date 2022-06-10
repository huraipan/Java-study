package com.enumex;

public class EnumEx01 {
	
	private Color mc = Color.Blue;
	
	
	

	public Color getMc() {
		return mc;
	}




	public void setMc(Color mc) {
		this.mc = mc;
	}




	public static void main(String[] args) {
		EnumEx01 ee = new EnumEx01();
		ee.setMc(Color.Green);
		Color color = ee.getMc();
		
		switch(color) {
		
		case Red :
			System.out.println("red");
			break;
			
		case Blue :
			System.out.println("blue");
			break;
			
		case Green :
			System.out.println("green");
			break;
			
		}
	}

}
