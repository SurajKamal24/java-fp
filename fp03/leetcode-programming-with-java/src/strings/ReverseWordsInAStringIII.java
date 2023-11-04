package strings;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseWordsInAStringIII {
	
	private static void reverse(char[] ch, int a, int b) {
		while (a < b) {
			char temp;
			temp = ch[a];
			ch[a] = ch[b];
			ch[b] = temp;
			a++;
			b--;
		}
	}

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		
		//Traditional approach
		char[] ch = s.toCharArray();
		int i = 0, j = 0, n;
		n = s.length();
		while(i < n && j < n) {
			while (i < n && ch[i] == ' ') {
				i++;
			}
			j = i;
			while (j < n && ch[j] != ' ') {
				j++;
			}
			reverse(ch, i, j - 1);
			i = j;	
		}
		System.out.println(new String(ch));
		
		//Functional approach
		System.out.println(
				List.of(s.split(" "))
					.stream()
					.map(str -> List.of(str.split("")).stream().reduce("", (a, b) -> b + a))
					.collect(Collectors.joining(" ")));
	}

}
