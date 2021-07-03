package com.training.methods.main;

import java.util.Scanner;

public class Task02 {
	private static int[] arr = new int [3];
	private static int numMax = Integer.MIN_VALUE;
	private static int numMin = Integer.MAX_VALUE;
	

	public static void main(String[] args) {
		
		inputNum();
		for (int i = 0; i < arr.length; i++) {
			 System.out.printf("%3d " + " | ", arr[i]); 
			 
			 
		}
		System.out.println();
		findNumMax();
		System.out.println();
		findNumMin();
		int sum = addition(numMax, numMin); 
		System.out.println("Сумма наибольшего и наименьшего числа равна: " + sum); 
		
	}
	public static void inputNum () {
		
		try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Введите число 1: ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введите целое число: ");
		}
		
		arr[0] = sc.nextInt();
		
		System.out.println("Введите число 2: ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введите целое число: ");
		}
		arr[1] = sc.nextInt();
		
		System.out.println("Введите число 3: ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введите целое число: ");
		}
		
		arr[2] = sc.nextInt();
		}	
	}
	
	public static void findNumMax() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > numMax) {
				numMax = arr[i];
			}
			
		}
		//System.out.println(numMax); вывод наибольшего числа
		
	}
	
	public static void findNumMin() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < numMin) {
				numMin = arr[i];
			}
			
		}
		//System.out.println(numMin); вывод наименьшего числа
	}
	
	public static int addition (int min, int max) {
		int sum;
		sum = min + max;
		 return sum; 
	}
	
	

}
