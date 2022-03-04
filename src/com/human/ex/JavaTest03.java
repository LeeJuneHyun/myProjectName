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
		
		//byte
		byte a1 = 10;
		byte a2;
		a2 = 11;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1+a2);
		System.out.println(a1+1);
		System.out.println("\n");
		//short
		short a3 = 10;
		short a4;
		a4 =11;
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a3+a4);
		System.out.println(a3+1);
		System.out.println("\n");
		//int
		int a5 = 10;
		int a6;
		a6 = 11;
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a5+a6);
		System.out.println(a5+1);
		System.out.println("\n");
		//long
		long a7 = 10L;
		long a8;
		a8 = 11l;
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a7+a8);
		System.out.println(a7+1);
		System.out.println("\n");
		//float
		float a9=10.23f;
		float a10;
		a10=11.f;
		System.out.println(a9);
		System.out.println(a10);
		System.out.println(a9+a10);
		System.out.println(a9+1.4f);
		System.out.println("\n");
		//double
		double a11=10.23;
		double a12;
		a12=11.94;
		System.out.println(a11);
		System.out.println(a12);
		System.out.println(a11+a12);
		System.out.println(a11+10.4);
		System.out.println("\n");
		//String
		String st1 = "Hello";
		String st2 = "World";
		System.out.println(st1);
		System.out.println(st1+ "World");
		System.out.println(st1 + st2);
		String st3 = st1 + st2;
		System.out.println(st3);
	}
}
