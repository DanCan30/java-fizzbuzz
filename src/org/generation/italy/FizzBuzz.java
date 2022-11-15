package org.generation.italy;

public class FizzBuzz {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			
			if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) {
				System.out.println("FizzBuzz (" + numbers[i] + ")");
			} else if (numbers[i] % 3 == 0) {
				System.out.println("Fizz (" + numbers[i] + ")");
			} else if (numbers[i] % 5 == 0) {
				System.out.println("Buzz (" + numbers[i] + ")");
			} else {	
				System.out.println(numbers[i]);
			}
		}
	}
}
