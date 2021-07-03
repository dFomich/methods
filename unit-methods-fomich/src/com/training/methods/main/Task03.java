package com.training.methods.main;

import java.util.Scanner;

public class Task03 {
	public static String num1;
	public static String num2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inputNum();
		if (num1.length() > num2.length()) {
			System.out.println("Больще цифр в числе: " + num1 + " " + "( " + num1.length() + " )");
		}else if (num1.length() < num2.length()) {
			System.out.println("Больще цифр в числе: " + num2 + " " + "( " + num2.length() + " )");
		}else {
			System.out.println("Количество цифр равно друг другу");
		}

	}
	
	public static void inputNum () {
		
		try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Введите число 1: ");
		num1 = sc.nextLine();
		System.out.println("Введите число 2: ");
		num2 = sc.nextLine();
		
		}	
	}

}
