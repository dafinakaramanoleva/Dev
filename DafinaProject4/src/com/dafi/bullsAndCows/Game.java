package com.dafi.bullsAndCows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
	private static Integer bulls;
	private static Integer cows;

	
	
	
	public static void main(String[] args) {
		
//		List<String> list = new ArrayList<String>();
//		list.add("1234");
//		list.add("2134");
//		removing("1895", list);
//		System.out.println(list);
		
		List<String> list = new ArrayList<String>();
		BullsAndCows variable = new BullsAndCows();
		variable.generateCombinations();
		list = variable.getGeneratedNumbers();
		System.out.println(list);

		System.out.println("Make up a number!");
		Random myRandomizer = new Random();
		String random = list.get(myRandomizer.nextInt(list.size()));
		System.out.println(random);

		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the number of bulls: ");
		bulls = input1.nextInt();
		System.out.println();
		System.out.println("Enter the number of cows");
		cows = input2.nextInt();
		
		List<String> result = variable.removing2(random, cows, list);
		System.out.println(result);

	}
}
