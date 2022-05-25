package study;

import java.util.*;
public class Testa001 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int op1, op2;
    double result;
    String op;
    result =0;
    
    
    System.out.print("");
    op1=sc.nextInt();
    op=sc.next();
    op2=sc.nextInt();
    
    
    switch(op) {
    
    
    case"+":
    	result=op1+op2;
    	break;
    case"-":
    	result=op1-op2;
    	break;
    case"*":
    	result=op1*op2;
    	break;
    case"/":
    	if(op2==0) {
    		System.out.println("0으로 나눌 수 없습니다.");
    		return;
    	}result=op1/op2;
    	default:
    		System.out.println("");
    	
    
    }
    System.out.printf("%d %s %d = %.2f",op1,op,op2,result);
    
    
//    if(op.equals("+")) {
//    	result = op1+op2;
//    }else if(op.equals("-")) {
//    	result=op1-op2;
//    }else if(op.equals("*")) {
//    	result=op1*op2;
//    }else if(op.equals("/")) {
//    	
//    }
		
		
		
		
		
		

	}

}
