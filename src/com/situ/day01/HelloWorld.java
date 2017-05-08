package com.situ.day01;

import org.junit.Test;


public class HelloWorld {
	public static void main(String args[]) {
		System.out.println("Hello World!");	
	    //80 90
	    int num1 = 80;
	    num1 = 90;
	    int num2 = 85;
	    int result = num1 + num2;
	    System.out.println(result);
    }
	
	
//	@Test
//	public void test(){
//		System.out.println("test");
//		}
	
	
	@Test
	
	public void test1(){
		//+ - * / %
		int num1 = 5;
		int num2 = 3;
		int resultAdd = num1 + num2;
		System.out.println(resultAdd);
		int result = 6 / 4;
		int result1 = 6 % 4;
		int result2 = 6 / 3;
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}
	
	@Test
	public void test2(){
		int num1 = 3;
		int num2 = 5;
		//&&短路
		System.out.println(num1 < 0 && num1++ < num2);
		System.out.println(num1);//3
		System.out.println(num2);//5
		// ||短路
		System.out.println(num1 > 0 || num1++ < num2);
		System.out.println(num1);//3
		System.out.println(num2);//5
	}
}
