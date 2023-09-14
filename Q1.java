package StreamQuestions;

import java.util.ArrayList;

public class Q1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(5);
		al.add(10);
		al.add(15);
		System.out.println("Listed Element : "+al);
		Double average = al.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println("Average Value : "+average);
	}
}
