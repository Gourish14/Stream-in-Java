package StreamQuestions;

import java.util.ArrayList;

public class Q9 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		System.out.println("Listed Elements : "+al);
		Integer i1 = al.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum = "+i1);
	}

}
