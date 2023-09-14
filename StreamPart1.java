package StreamInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPart1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(20);
		al.add(15);
		al.add(30);
		al.add(40);
		al.add(35);
		System.out.println(al);
		
		//filter() is a type of "predicate" functional interface used for conditional execution
		List<Integer> l1 = al.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println("Even Elements : "+l1);
		
		//map() is a type of "function" functional interface  
		List<Integer> l2 = al.stream().map(i -> i+10).collect(Collectors.toList());
		System.out.println("Added Elements : "+l2);
		
		//count() counts the number of elements in list, here it is stored in Object format
		Long l3 = al.stream().count();
		System.out.println("No. of  Elements : "+l3);
		
		//count() counts the number of elements in list, here it is stored in long format
		long l4 = al.stream().count();
		System.out.println("No. of  Elements : "+l4);
		
		//filter() is filtering the element above 20 and count() is counting that elements, here it is stored in Object format
		Long l5 = al.stream().filter(j -> j>20).count();
		System.out.println("No. of  Elements above 20 : "+l5);
		
		//filter() is filtering the element above 20 and count() is counting that elements, here it is stored in long format
		long l6 = al.stream().filter(j -> j>20).count();
		System.out.println("No. of  Elements above 20 : "+l6);
		
		//Default Sorting Method of Comparable
		List<Integer> l7 = al.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Elements : "+l7);
		
		//Default Sorting Method of Comparator
		List<Integer> l8 = al.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Sorted Elements : "+l8);
		
		//Reverse Sorting Method of Comparator
		List<Integer> l9 = al.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("Reversed Sorted Elements : "+l9);
		
		//For more sorting, switch to StreamPart2 class.
	}
}
