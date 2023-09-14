package StreamInJava;

import java.util.ArrayList;

public class StreamPart4 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(15);
		al.add(30);
		al.add(40);
		al.add(35);
		System.out.println("Listed Integer : "+al);
		al.stream().forEach(i-> System.out.println("Square of the elements : "+i*i));
		al.stream().forEach(i-> System.out.println("Cube of the elements : "+i*i*i));
	}
}
