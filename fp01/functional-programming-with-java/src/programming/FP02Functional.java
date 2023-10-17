package programming;

import java.util.List;
import java.util.stream.Collectors;


public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		List<Integer> squaredNumbers = squareList(numbers);
		
		List<Integer> evenNumbersOnly = numbers.stream()
											.filter(number -> number % 2 == 0)
											.collect(Collectors.toList());
		
		System.out.println(squaredNumbers);
		System.out.println(evenNumbersOnly);
		
		//int sum = addListFunctional(numbers);
		//System.out.println(sum);
	}
	
	private static List<Integer> squareList(List<Integer> numbers) {
		return numbers.stream()
				.map(number -> number * number)
				.collect(Collectors.toList());
	}

	private static int sum(int aggregate, int nextNumber) {
		System.out.println(aggregate + " " + nextNumber);
		return aggregate + nextNumber;
	}

	private static int addListFunctional(List<Integer> numbers) {
		//Stream of numbers -> One result value
		  //Combine them into one result => One value
		  // 0 and FP02Functional::sum	
		return numbers.stream()
				//.reduce(0,FP02Functional::sum);
				.reduce(0, Integer::sum);
	}

	

}
