package org.test.codility;

public class TestAdjacency {

	public static void main(String[] args) {
		// int A[] = {1,1,0,1,0,0,1,1};
		int A[] = { 0, 0 };
		System.out.println("Result Adjacency " + solution(A));
		System.out.println("Result Adjacency 2 " + solutionTo(A));
	}

	public static int solution(int[] A) {
		int n = A.length;
		int result = 0;
		if (n < 1 && n > 1000) {
			return 0;
		}
		for (int i = 0; i < n - 1; i++) {
			if (A[i] == A[i + 1])
				result = result + 1;
		}
		int r = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			if (i > 0) {
				if (A[i - 1] != A[i])
					count = count + 1;
				else
					count = count - 1;
			}
			if (i < n - 1) {
				if (A[i + 1] != A[i])
					count = count + 1;
				else
					count = count - 1;
			}
			r = Math.max(r, count);
		}
		return result + r;
	}

	public static int solutionTo(int[] A) {
		// n length of the array
		int n = A.length;
		int result = 0;
		// Calculate the number of consecutive identical ones, for both sides
		for (int i = 0; i < n - 1; i++) {
			if (A[i] == A[i + 1])
				result = result + 1;
		}
		// Calculate max delta
		int r = 0;
		for (int i = 0; i < n; i++) {
			// count: current delta
			int count = 0;
			if (i > 0) {
				if (A[i - 1] != A[i])
					count = count + 1;
				else
					count = count - 1;
			}
			if (i < n - 1) {
				if (A[i + 1] != A[i])
					count = count + 1;
				else
					count = count - 1;
			}
			r = Math.max(r, count);
		} // max
		return result + r;
	}
}
