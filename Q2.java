package StreamQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Gourish");
		al.add("Rahul");
		al.add("Shaan");
		System.out.println("Listed String Elements : "+al);
		List<String> s = al.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println("LoweredCase Elements : "+s);
		List<String> s1 = al.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("LoweredCase Elements : "+s1);
	}
}
