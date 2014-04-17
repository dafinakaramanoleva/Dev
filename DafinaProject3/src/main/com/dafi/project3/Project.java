package com.dafi.project3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Project {
	public static void main(String[] args) {
		
		System.out.println("Inputs");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write dimension here : ");

		int dimension = scan.nextInt();

		System.out.println("Write the matrix 1 row by row splited by comma : ");
		Integer[][] matrix1 = new Integer[dimension][dimension];
		for (int i = 0; i < dimension; i++) {
			String[] rowAsStrings = scan.next().split(",");
			for (int j = 0; j < rowAsStrings.length; j++) {
				matrix1[i][j] = Integer.valueOf(rowAsStrings[j]);
			}
		}
		
		System.out.println("Write the matrix 2 row by row splited by comma : ");
		Integer[][] matrix2 = new Integer[dimension][dimension];
		for (int i = 0; i < dimension; i++) {
			String[] rowAsStrings = scan.next().split(",");
			for (int j = 0; j < rowAsStrings.length; j++) {
				matrix2[i][j] = Integer.valueOf(rowAsStrings[j]);
			}
		}
		
		MatrixSolver matrixSolver = new MatrixSolver(new VectorSolver());
		matrixSolver.printMatrix(matrixSolver.multiplyMatrix(matrix1, matrix2));
		System.out.println();
		matrixSolver.printMatrix(matrixSolver.transMatrix(matrix1));
		matrixSolver.printMatrix(matrixSolver.sumMatrix(matrix1, matrix2));
		matrixSolver.printMatrix(matrixSolver.multiplyOne(matrix1));
		System.out.println();
		
	
		
	}

}
