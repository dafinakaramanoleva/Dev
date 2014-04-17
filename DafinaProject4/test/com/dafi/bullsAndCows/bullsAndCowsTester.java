package com.dafi.bullsAndCows;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.sun.xml.internal.ws.api.pipe.Fiber.Listener;

public class bullsAndCowsTester {
	private BullsAndCows number;

	
	@Before
	public void before() {
		this.number = new BullsAndCows();
	
	}
	
	@Test
	public void removingTest() {
		List<String> expectedResults = Arrays.asList();
		List<String> result1 = Arrays.asList();
		List<String> result = number.removing("1234",0, result1);
		
		
		assertEquals(expectedResults.size(), result.size());
		for (String string : expectedResults) {
			assertTrue(result.contains(string));
		}
		
	}
	
	@Test
	public void removing2Test() {
		List<String> expectedResults = Arrays.asList();
		List<String> result1 = Arrays.asList();
		List<String> result = number.removing2("1234",0, result1);
		
		
		assertEquals(expectedResults.size(), result.size());
		for (String string : expectedResults) {
			assertTrue(result.contains(string));
		}
		
	}
	
	@Test
	public void permotationTest() {
		List<String> expectedResults = Arrays.asList("012", "021", "102", "120", "201", "210");
		number.makePermutation("", "012");
		List<String> result = number.getGeneratedNumbers();
		
		assertEquals(expectedResults.size(), result.size());
		for (String string : expectedResults) {
			assertTrue(result.contains(string));
		}
	}
	
	@Test
	public void generatesCombinationTest(){
		    number.generateCombinations();
			List<String> result = number.getGeneratedNumbers();
			Set<String> resultAsSet = new HashSet<String>(result);
			assertEquals(5040, result.size());
			assertEquals(resultAsSet.size(), result.size());
		
			
			
	}
	

}
