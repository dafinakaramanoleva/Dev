package com.dafi.project3;

public class MatrixSolver {
	private VectorSolver vectorSolver;
	
	public MatrixSolver(VectorSolver vectorSolver) {
		this.vectorSolver = vectorSolver;
	}

	public void printMatrix(Integer[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public Integer[][] multiplyMatrix(Integer[][] matrix1, Integer[][] matrix2) {
		
		Integer[][] result = new Integer[matrix1.length][matrix1[0].length];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				result[i][j] = vectorSolver.scalar(matrix1[i], getColumnByIndex(matrix2, j));
			}
		}
		System.out.println();
		return result;

	}

	public Integer[][] multiplyOne(Integer[][] matrix1) {
		return multiplyMatrix(matrix1, generateOneMatrix(matrix1.length));
	}

	public Integer[][] sumMatrix(Integer[][] matrix1, Integer[][] matrix2) {
		Integer[][] result = new Integer[matrix1.length][matrix1[0].length];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {

				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		System.out.println();

		return result;
	}

	public Integer[][] transMatrix(Integer[][] matrix) {
		Integer[][] result = new Integer[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				result[i][j] = matrix[j][i];

			}
		}

		return result;
	}
	
	private Integer[][] generateOneMatrix(int n) {
		Integer[][] result = new Integer[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				result[i][j] = i == j ? 1 : 0;
			}
		}
		
		return result;
	}

	private Integer[] getColumnByIndex(Integer[][] matrix, int index) {
		Integer[] result = new Integer[matrix.length];

		for (int i = 0; i < matrix.length; i++) {
			result[i] = matrix[i][index];
		}

		return result;
	}

	private Integer scalar(Integer[] vector1, Integer[] vector2) {
		Integer result = 0;
		for (int i = 0; i < vector1.length; i++) {
			result += vector1[i] * vector2[i];
		}

		return result;
	}

}
