package Phase1.Jav.collection;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashsetExp {
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		
		LinkedHashSet<Comparable> L1 = new LinkedHashSet<Comparable>();
		LinkedHashSet<Integer> L2 = new LinkedHashSet<Integer>();
		
		System.out.println("Enter the the 1st Integer");
		
		int i1 = scr.nextInt();
		
		System.out.println("Enter the the 2nd Integer");
		
		int i2 = scr.nextInt();
		System.out.println("Enter the the 3rd Integer");
		int i3 = scr.nextInt();
		System.out.println("Enter the the 4th Integer");
		int i4 = scr.nextInt();
		
		
		L1.add(3);
		L1.add(34);
		L1.add(34.5);
		L1.add(678.9);
		L1.add('K');
		L1.add('A');
		L1.add(true);
		
		L2.add(i1);
		L2.add(i2);
		L2.add(i3);
		L2.add(i4);
		
		scr.close();
		
		System.out.println("The L1 LinkedHashedSet contains" +L1);
		System.out.println("The L2 LinkedHashedSet Contains " +L2);
		
		
		
		
		
	}

}
