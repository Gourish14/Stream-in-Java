package StreamQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q6 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Gourish");
		al.add("Rahul");
		al.add("Shaan");
		al.add("Ashish");
		al.add("Rocky");
		al.add("Alia");
		System.out.println("Listed String Elements : "+al);
		
		List<String> l1 = al.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending Order : "+l1);
		
		List<String> l2 = al.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending Order : "+l2);
	}

}
