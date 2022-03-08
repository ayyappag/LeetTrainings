package com.studyplan.algorithmsone.medium;

import java.util.Arrays;

// https://www.geeksforgeeks.org/distance-nearest-cell-1-binary-matrix/
// https://leetcode.com/problems/01-matrix/
public class MatrixLeet {

	public static void main(String[] args) {
// [[0,0,0],[0,1,0],[0,0,0]]

		int mat[][] = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int[][] t = updateMatrix(mat);

	}

	public static int[][] updateMatrix(int[][] matrix) {
		int r = matrix.length;
		int c = matrix[0].length;

		int dist[][] = new int[r][c];

		for (int arr[] : dist)
			Arrays.fill(arr, Integer.MAX_VALUE - 10000);

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (matrix[i][j] == 0)
					dist[i][j] = 0;

				else {
					if (i > 0)
						dist[i][j] = Math.min(dist[i][j], dist[i - 1][j] + 1);
					if (j > 0)
						dist[i][j] = Math.min(dist[i][j], dist[i][j - 1] + 1);
				}
			}
		}

		for (int i = r - 1; i >= 0; i--) {
			for (int j = c - 1; j >= 0; j--) {
				if (i < r - 1)
					dist[i][j] = Math.min(dist[i][j], dist[i + 1][j] + 1);

				if (j < c - 1)
					dist[i][j] = Math.min(dist[i][j], dist[i][j + 1] + 1);
			}
		}

		return dist;
	}

}
