package com.human.ex;

public class JavaTest03 {

	public static void main(String[] args) {
		
		//boolean
		System.out.println(true);
		System.out.println(false);
		System.out.println("\n");
		
		System.out.println('a');
		System.out.println('각');
		System.out.println('\u0041');
		System.out.println('\u0042');
		System.out.println("\n");
		
		byte b1 = 23;
		short s1 = 27;
		int i = 21;
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i);
		System.out.println("\n");
		
		// int형 상수
		
		int i1 = 15;          // 십진수15
		int i2 = 015;         // 015는 8진수로 십진수 13 
		int i3 = 0x25;        // 0x25는 16진수로 십진수 37
		int i4 = 0b01001;     // 0b01001은 2진수로 십진수 9
		/*int i5 = 058;       8진수에 8이 있어 에러
		int i6 = 0b0501;      2진수에 5가 있어 에러
		*/
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println("\n");
		
		System.out.println(10000000000L);
		System.out.println(10000000000l);
		System.out.println("\n");
		
		//float형 상수
		System.out.println(3.14F);
		System.out.println(3.14f);
		System.out.println(3f);
		System.out.println(3.f);
		System.out.println(.14f);
		System.out.println("\n");
		
		//double형 상수
		System.out.println(3.14);
		System.out.println(3.);
		System.out.println(.14);
		System.out.println(3D);
		System.out.println(.14d);
		System.out.println(3.14D);
		System.out.println(3.14E-4);
		System.out.println("\n");
		
		System.out.println(Math.PI);
		System.out.println("\n");
	}
}
