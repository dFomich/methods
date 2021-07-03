package com.training.methods.main;
import java.util.Scanner;


public class Task01 {
	

	public static void main(String[] args) {
		// Нахождение НОК и НОД

		int [] input = inputNum();
		int firstNum = input[0];
		int secondNum = input[1];
		
		printResult(firstNum, secondNum);
		
		
	}
		public static int[] inputNum () {
			
			try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Введите число a: ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Введите целое число: ");
			}
			int inputA = sc.nextInt();
			System.out.println("Введите число b: ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Введите целое число: ");
			}
			int inputB = sc.nextInt();
			
			return new int [] {inputA,inputB};
			}
		}
		
		public static void printResult (int inputA, int inputB) {
			
			
			System.out.println ("НОК = " + findNok(inputA, inputB));
			System.out.println ("НОД = " + findNod(inputA, inputB));
		}
	
		public static int findNok(int a, int b) {
			
			int nok;
			
			nok = a * b / findNod(a,b);
			
			return nok;
			
		
		}
		public static int findNod(int a, int b) {
			
			int nod;
			
			while (a != b) {
				if (a > b) {
					a = a -b;
					
				}else {
					b = b - a;
				}
				
			} nod = a;
			return nod;
		}
					
			
}

	

