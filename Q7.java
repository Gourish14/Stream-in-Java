package StreamQuestions;

import java.util.ArrayList;

public class Q7 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(5);
		al.add(10);
		al.add(15);
		System.out.println("Listed Element : "+al);
		Integer i1 = al.stream().min((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("Minimum Element : "+i1);
		Integer i2 = al.stream().max((s1,s2)->s1.compareTo(s2)).get();
		System.out.println("Minimum Element : "+i2);
	}
}