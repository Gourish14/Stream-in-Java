package StreamQuestions;

import java.util.ArrayList;

public class Q8 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(5);
		al.add(10);
		al.add(15);
		System.out.println("Listed Element : "+al);
		
		Integer i1 = al.stream().sorted().skip(1).findFirst().orElse(0);
		System.out.println("Second Smallest : "+i1);
		Integer i2 = al.stream().sorted((s1,s2)->s2.compareTo(s1)).skip(1).findFirst().orElse(0);
		System.out.println("Second Largest : "+i2);
	}
}