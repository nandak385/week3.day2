package week3.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "PayPalIndia";
		

		char[] charArray = str.toCharArray();

		Set<Character> charList = new LinkedHashSet<Character>();
		Set<Character> dupCharList = new LinkedHashSet<Character>();

		for (Character c : charArray) {
			boolean uni = charList.add(c);
			if (uni == false)
				dupCharList.add(c);

		}
		System.out.println("Duplicate Characters are : " + dupCharList);
		charList.removeAll(dupCharList);
		System.out.println("The Character Set after removing Duplicates : " + charList);

	}
}