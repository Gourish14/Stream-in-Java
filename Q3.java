package StreamQuestions;

import java.util.ArrayList;

public class Q3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		System.out.println("Listed Elements : "+al);
		Integer even = al.stream().filter(e->e%2==0).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of Even Elements : "+even);
		Integer odd = al.stream().filter(o->o%2!=0).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of Odd Elements : "+odd);
	}
}
