package com.methodex;

/*
 *  �޼ҵ� ���ǽ� ���ϵ� ������ �ڷ����� '...'��� ����ϹǷ� �̸� ���� �޼ҵ带 �����ϴµ�
 *  �ʿ��� ������ ���� ����(���������� �迭ȭ �۾��� �ڵ����� ����)�ϰ� ������ �� �ִ�.
 */
public class VariableEx {
	
	public void argsTest(String ...n) {
		for(int i=0;i<n.length;i++) {
			System.out.println("n["+i+"]"+n[i]);
		}
	}

	public static void main(String[] args) {
		VariableEx ve = new VariableEx();
		ve.argsTest("a","b","c");
		ve.argsTest("100","600","1000","10000");

	}

}
