package strings;

import java.util.Iterator;
import java.util.List;

public class ReverseWordsInAString {
	public static void main (String[] args) {
		String strToBeRevered = "the  sky is blue";
		String[] wordsList = strToBeRevered.split(" ");
		
		//Functional approach
		System.out.println(
				List.of(wordsList)
				.stream()
				.filter(str -> ! str.isEmpty())
				.reduce("", (str1, str2)-> str2 + " " + str1)
				.trim());
		
		//Traditional approach
		
		StringBuilder builder = new StringBuilder();
		strToBeRevered.split(" ");
		for (int i = wordsList.length -1 ; i >= 0 ; i--) {
			if (! wordsList[i].isEmpty()) {
				builder.append(wordsList[i]);
				builder.append(" ");
			}
		}
		System.out.println(builder.toString().trim());
		
	}
}
