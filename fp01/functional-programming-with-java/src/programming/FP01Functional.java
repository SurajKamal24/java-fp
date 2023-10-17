package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		//printAllNumbersInListFunctional(numbers);
		//printEvenNumbersInListFunctional(numbers);
		printSquaresOfEvenNumbersInListFunctional(numbers);
	}
	
//	public static void print(int number) {
//	System.out.println(number);
//}

//	public static boolean isEven(int number) {
//		return number % 2 == 0;
//	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//What to do?
		numbers.stream().forEach(System.out::println); // Method reference
	}

	//number -> number%2 == 0
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		//What to do?
		numbers.stream() //Convert to stream
				//.filter(FP01Functional::isEven) //Filter - Only allow even numbers
				.filter(number -> number % 2 == 0) //Lambda expression
				.forEach(System.out::println); //Method reference
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		//What to do?
		numbers.stream() // Convert to stream
				//.filter(FP01Functional::isEven) //Filter - Only allow even numbers
				.filter(number -> number % 2 == 0) //Lambda expression
				.map(number -> number * number) //mapping - x -> x * x
				.forEach(System.out::println); //Method reference
	}

}
