package com.training.methods.main;
import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		// 
		Random rand = new Random();
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100); 
			System.out.printf("%3d ", arr[i]);
		
		}
		System.out.println();
		
		int sum1 = addiction(arr[0], arr[1], arr[2] );
		int sum2 = addiction(arr[2], arr[3], arr[4] );
		int sum3 = addiction(arr[3], arr[4], arr[5] );
		
		output(sum1);
		output(sum2);
		output(sum3);
	}
	
	public static int addiction(int a, int b, int c) {

		int sum = a + b + c;
		return sum;
	}
	
	public static void output(int sum) {
		System.out.println("Сумма 3 элементов массива равна: " + sum);
	}
	

}
