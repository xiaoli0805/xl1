package com.situ.day01;

import java.util.Scanner;

public class Test3 {

	/*
	 * 学生成绩的管理： >=90 <=100 优秀 >=80 <90 良好 >=70 <80 一般 >=60 <70 及格
	 * 
	 * >100 <0 错误
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生的成绩：");
		int score = scanner.nextInt();
		System.out.println("score " + score);
		
		if(score > 100 || score < 0){
			System.out.println("非法输入！");
			return;
		}		
		if (score >= 90 && score <= 100) {
			System.out.println("优秀！");
		} else if (score >= 80) {
			System.out.println("良好！");
		} else if (score >= 70 ) {
			System.out.println("一般！");
		} else if (score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格！");
		} 
	}
}
