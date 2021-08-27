package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {
	
	public static void main(String[] args) {
		
		String[] str = {"Google","Microsoft","TestLeaf","Maverick"};
		List<String> len = new ArrayList<String>(Arrays.asList(str));
        int size = len.size();
        System.out.println("The of the array is " + size);
        
        System.out.println("Before reverse"+len);
        
        Collections.sort(len);
        System.out.println("Sorted array list are " + len);
        
        Collections.reverse(len);
        System.out.println("Reverse order of an array list are " + len);

	}

}
