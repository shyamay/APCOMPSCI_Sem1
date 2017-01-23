import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Lesson_104
{
	public static void main(String[]args)
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>();

		System.out.println("list1 size: " + list1);
		System.out.println("list2 size: " + list2);
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list2.add("a");
		list2.add("b");
		list2.add("c");
		
		System.out.println("List1 with numbers... \n" + list1);
		System.out.println("List2 with letters... \n" + list2);
		
		System.out.println("Length of list1..." + list1.size());
		System.out.println("Length of list2..." + list2.size());
		
		int number = list1.get(2);
		System.out.println(number);
	}


}
