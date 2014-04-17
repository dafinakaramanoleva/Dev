package com.dafi.project3;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatrixSolverTest {
	private MatrixSolver matrixSolver;
	private VectorSolver vectorSolver;
	
	@Before
	public void before() {
		vectorSolver = new VectorSolver();
		matrixSolver = new MatrixSolver(vectorSolver);
	}

	@Test
	public void sumMatrixTest() {
		Integer[][] matrix1 = {
				{1, 2},
				{3, 4}
		};
		
		Integer[][] matrix2 = {
				{1, 2},
				{3, 4}
		};
		
		Integer[][] result = matrixSolver.sumMatrix(matrix1, matrix2);
		
		Integer[][] expectedResult = {
				{2, 4},
				{6, 8}
		};
		
		assertArrayEquals(expectedResult, result);
	}
	
	@Test
	public void multiplyOneTest() {
		Integer[][] matrix1 = {
				{1,2},
				{3,4}
		};
		
		Integer[][] result = matrixSolver.multiplyOne(matrix1);
		
		
		Integer[][] expectedResult = {
				{1,2},
				{3,4}
		};
		
		assertArrayEquals(expectedResult, result);
		
   }
	
	@Test
	public void transMatrixTest() {
		Integer[][] matrix1 = {
				{1,2},
				{3,4}
		};
		
		Integer[][] result = matrixSolver.transMatrix(matrix1);
		
		Integer[][] expectedResult = {
				{1,3},
				{2,4}
		};
		assertArrayEquals(expectedResult, result);
	
	}
	
	@Test
	public void multiplyMatrixTest() {
		Integer[][] matrix1 = {
				{1,2},
				{3,4}
		};
		
		Integer[][] matrix2 = {
				{1, 2},
				{3, 4}
		};
		
		Integer[][] result = matrixSolver.multiplyMatrix(matrix1,matrix2);
		matrixSolver.printMatrix(result);
		
		Integer[][] expectedResult = {
				{7,10},
				{15,22}
		};
		assertArrayEquals(expectedResult, result);
	
	}
	
}
