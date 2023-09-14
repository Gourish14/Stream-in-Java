package StreamQuestions;

import java.util.ArrayList;

public class Q10 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("");
		boolean s1 = al.stream().filter(str-> str.isEmpty()).findFirst().isPresent();
		System.out.println("Is String Empty ? "+s1);
	}
}
