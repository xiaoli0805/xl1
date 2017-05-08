package com.situ.day01;


public class Day2 {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
			
		//顺序结构 条件结构（if） 循环结构
		
//		if(boolean条件){
//			
//		}
//		while(boolean条件){
//			
//		}
		
//		int num = 1;//1.循环条件的初始化
//		while(num <= 5){//2.循环条件的判断
//			num++;//3.循环条件的改变（趋向于循环条件）
//			System.out.println("Hello World!");
//		}
		
		//1+2+3+……+100 = 5050
		
		
		int sum = 0;
		for(int i = 1;i <= 100;i++) {
			sum = sum + i;
		}
		System.out.println(sum);		
	}
	

	//1+2+3+……+100=5050
//	public void test(){
//		int sum = 0;	
//		int j = 1;		
//		while(j <= 100){						
//			sum = sum + j;//sum+=j;
//			j++;
//		}
//		System.out.println("sum:" + sum);
//	}
//
//	@Test
//	public void for1(){
//		for(int i = 1;i <= 5;i++) {
//			System.out.println("HelloWorld!");
//		}
//	}
	
}
