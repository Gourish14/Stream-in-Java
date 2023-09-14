package StreamQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(6);
		al.add(6);
		al.add(7);
		al.add(7);
		al.add(8);
		List<Integer> l1 = al.stream().distinct().collect(Collectors.toList());
		System.out.println("New Listed Elements after removing Duplicates : "+l1);
	}

}
