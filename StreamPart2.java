package StreamInJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPart2 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Gourish");
		al.add("Sahil");
		al.add("Rohit");
		al.add("Flexer");
		al.add("Abhishek");
		al.add("Bhalu");
		System.out.println("Listed Strings : "+al);
		
		//Sorting String List Alphabetical Wise in Increasing Order using Comparable
		List<String> l1 = al.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Strings Ascending : "+l1);
		
		//Sorting String List Alphabetical Wise in Decreasing Order using Comparator
		Comparator<String> c = (c1,c2) -> {
			return c2.compareTo(c1);
		};
		
		List<String> l2 = al.stream().sorted(c).collect(Collectors.toList());
		System.out.println("Sorted Strings Descending : "+l2);
		
		//Sorting String List Length Wise using Comparator
		Comparator<String> cd = (cd1,cd2) -> {
			int sd1=cd1.length();
			int sd2=cd2.length();
			if(sd1<sd2) {return -1;}
			else if(sd1>sd2) {return 1;}
			else {return 0;}
		};
		List<String> l3 = al.stream().sorted(cd).collect(Collectors.toList());
		System.out.println("Sorted Strings Length Wise : "+l3);
		
		//Sorting String List Length Wise and Alphabetical Wise using Comparator
		Comparator<String> cm = (cm1,cm2) -> {
			int sm1 = cm1.length();
			int sm2 = cm2.length();
			if(sm1<sm2) {return -1;}
			else if(sm1>sm2) {return 1;}
			else return cm1.compareTo(cm2);
		};
		
		List<String> l4 = al.stream().sorted(cm).collect(Collectors.toList());
		System.out.println("Sorted Strings Both Wise : "+l4);
	}
}