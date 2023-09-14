package StreamQuestions;

import java.util.ArrayList;

public class Q5 {

	public static void main(String[] args) {
		 ArrayList<String> al = new ArrayList<>();
		 al.add("Gourish");
		 al.add("Ashish");
		 al.add("Rocky");
		 al.add("Alia");
	     char letter = 'A'; 
	     int count = (int) al.stream().filter(str -> str.startsWith(String.valueOf(letter))).count();
	     System.out.println("No. of String Elements : "+count);
	}
}
