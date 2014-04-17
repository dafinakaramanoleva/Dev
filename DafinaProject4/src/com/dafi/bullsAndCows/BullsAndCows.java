package com.dafi.bullsAndCows;
import java.util.ArrayList;
import java.util.List;
import com.sun.org.apache.bcel.internal.generic.Select;

public class BullsAndCows {
	private List<String> generatedNumbers;
	
	public BullsAndCows() {
		this.generatedNumbers = new ArrayList<String>();
	}
	
	/*public List<String> removing2(String number, Integer numberOfCows, List<String> list){
		if (numberOfCows == 0){
			List<String> forRemovement = new ArrayList<String>();
				for (String element : list) {
					for (char numberChar : number.toCharArray()) {
						if (element.indexOf(numberChar) > 0) {
							forRemovement.add(element);
							break;
						}
				}
			}
			list.removeAll(forRemovement);	
		}
		if (numberOfCows == 1){
			List<String> forRemovement = new ArrayList<String>();
			for (String element : list) {
				for (char numberChar : number.toCharArray()){
					if(element.contains(number.substring(3))){
						forRemovement.add(element);
						break;
					}
					if(element.contains(number.substring(0, 0))){
						forRemovement.add(element);
						break;
					}	
					if(element.contains(number.substring(1, 1))){
						forRemovement.add(element);
						break;
					}
					if(element.contains(number.substring(2, 2))){
						forRemovement.add(element);
						break;
					}
				
				}
			}	
			list.removeAll(forRemovement);
		}
		
		if (numberOfCows == 2){
			List<String> forRemovement = new ArrayList<String>();
			for (String element : list) {
				for (char numberChar : number.toCharArray()){
					
					
			
				}
			}
		}
		
		if (numberOfCows == 3){
			List<String> forRemovement = new ArrayList<String>();
			for (String element : list) {
				for (char numberChar : number.toCharArray()){
					
					
			
				}
			}
		}
		
		if (numberOfCows == 4){
			List<String> forRemovement = new ArrayList<String>();
			for (String element : list) {
				if (element.contains(number)) {
					forRemovement.add(element);
					continue;
				}
			}
			list.removeAll(forRemovement);	
		}
		
		return list;
	}
	
	public List<String> removing(String number, Integer numberOfBulls, List<String> list) {
		if (numberOfBulls == 0) {
			List<String> forRemovement = new ArrayList<String>();
			for (String element : list) {
				if (element.charAt(0) == number.charAt(0)) {
					forRemovement.add(element);
					continue;
				}
				if (element.charAt(1) == number.charAt(1)) {
					forRemovement.add(element);
					continue;
				}
				if (element.charAt(2) == number.charAt(2)) {
					forRemovement.add(element);
					continue;
				}
				if (element.charAt(3) == number.charAt(3)) {
					forRemovement.add(element);
					continue;
				}
			}
			list.removeAll(forRemovement);
		}
		if (numberOfBulls == 1) {
			List<String> forRemovement = new ArrayList<String>();
			for (String element : list) {
				if (element.charAt(0) == number.charAt(0) && element.charAt(1) == number.charAt(1)) {
					forRemovement.add(element);
					continue;
				}
				if (element.charAt(0) == number.charAt(0) && element.charAt(2) == number.charAt(2)) {
					forRemovement.add(element);
					continue;
				}
				if (element.charAt(0) == number.charAt(0) && element.charAt(3) == number.charAt(3)) {
					forRemovement.add(element);
					continue;
				}
				if (element.charAt(1) == number.charAt(1) && element.charAt(2) == number.charAt(2)) {
					forRemovement.add(element);
					continue;
				}
				if (element.charAt(1) == number.charAt(1) && element.charAt(3) == number.charAt(3)) {
					forRemovement.add(element);
					continue;
				}
				if (element.charAt(2) == number.charAt(2) && element.charAt(3) == number.charAt(3)) {
					forRemovement.add(element);
					continue;
				}
			}
			list.removeAll(forRemovement);
		}
		
		if (numberOfBulls == 2){
			List<String> forRemovement = new ArrayList<String>();
			for (String element : list) {
				if (element.charAt(0) == number.charAt(0) &&
						element.charAt(1) == number.charAt(1) &&
								element.charAt(2) == number.charAt(2)
						) {
					forRemovement.add(element);
					continue;
				}
				if ( element.charAt(1) == number.charAt(1 )&&
						element.charAt(2) == number.charAt(2) &&
								element.charAt(3) == number.charAt(3)
						) {
					forRemovement.add(element);
					continue;
				}
			}
			list.removeAll(forRemovement);
		}
		if (numberOfBulls == 3){
			
		}
		
		
		if (numberOfBulls == 4) {
			System.out.println("You have guessed the right number!!!!!");
		}
		
		return list;
	}*/
	
	
	public void generateBullMasks(){
		
	}
	
	
	public void generateCombinations() {
		for(int a = 0; a <= 9; a++)
			for(int b = a + 1; b <= 9; b++)
				for(int c = b + 1; c <= 9; c++)
					for(int d = c + 1; d <= 9; d++) {
				String forPermutation = String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(d);
						makePermutation("", forPermutation);
						
					}
	}
	
	public void makePermutation(String prefix, String string) {
		int lenght = string.length();
		if(lenght == 0) {
			generatedNumbers.add(prefix);
		} else {
			for(int i = 0; i < lenght; i++) {
				makePermutation(prefix + string.charAt(i), string.substring(0, i) + string.substring(i + 1, lenght));
			
			}
		}
	}

	public List<String> getGeneratedNumbers() {
		return generatedNumbers;
	}
	
	public void Bulls(){
		
	}
	
	public void Cows(){
		
	}
	
}
