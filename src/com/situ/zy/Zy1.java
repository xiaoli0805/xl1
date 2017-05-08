package com.situ.zy;

public class Zy1 {
	public static void main(String[] args) {
		int num = 0;
		for (int i = 1;i <= 100;i++) {
			if(i % 7 == 0) {
				num++;
			}
		}
		System.out.println(num);
	}
}
