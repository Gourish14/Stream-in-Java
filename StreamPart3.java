package StreamInJava;

import java.util.ArrayList;

public class StreamPart3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(15);
		al.add(30);
		al.add(40);
		al.add(35);
		System.out.println("Listed Integer : "+al);
		
		//Getting the minimum element from the List 
		Integer minimum = al.stream().min((s1,s2)-> s1.compareTo(s2)).get();
		System.out.println("Minimum Element : "+minimum);
		
		//Getting the maximum element from the List 
		Integer maximum = al.stream().max((s1,s2)-> s1.compareTo(s2)).get();
		System.out.println("Minimum Element : "+maximum);
	}
}
