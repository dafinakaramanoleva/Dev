package com.dafi.project3;

public class VectorSolver {
	
	public Integer[] multiplyVectors(Integer[] vector1, Integer[] vector2, int n) {
		Integer[] result = new Integer[n];
		for(int i = 0; i < vector1.length; i++){
			result[i] = vector1[i] * vector2[i];
		}
		
		return result;
	}
	
	public Integer scalar(Integer[] vector1, Integer[] vector2) {
		Integer result = 0;
		for (int i = 0; i < vector1.length; i++) {
			result += vector1[i] * vector2[i];
		}

		return result;
	}
	
	public Integer[] sumVectors (Integer[] vector1, Integer[] vector2, int n) {
		Integer[] result = new Integer[n];
		for (int i=0; i < vector1.length; i++) {
			result[i] = vector1[i] + vector2[i];
		}	
		
		return result;
	}
}
