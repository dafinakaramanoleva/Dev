package com.dafi.project3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VectorSolverTest {
	private VectorSolver vectorSolver;
	
	@Before
	public void before() {
		vectorSolver = new VectorSolver();
	}
	
	@Test
	public void scalarTest() {
		Integer[] vector1 = {1, 2, 3};
		Integer[] vector2 = {4, 5, 6};
		
		Integer expectedResult = 32;
		
		Integer result = vectorSolver.scalar(vector1, vector2);
		assertEquals(expectedResult, result);
	}

	@Test
	public void multiplyVectorsTest() {
		Integer[] vector1 = {1, 2, 3};
		Integer[] vector2 = {2, 3, 4};
		
		Integer[] expectedResult = {2, 6, 12};
		
		Integer[] result = vectorSolver.multiplyVectors(vector1, vector2, 3);
		
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void sumVectorsTest() {
		Integer[] vector1 = {1, 2, 3};
		Integer[] vector2 = {2, 3, 4};
		
		Integer[] expectedResult = {3, 5, 7};
		
		Integer[] result = vectorSolver.sumVectors(vector1, vector2, 3);
		
		assertEquals(expectedResult, result);
		
		
	}
}
