package org.test.codility;

public class TestMain {

	public static void main(String[] args) {
		// int[] a = {-1,3,-4,5,1,-6,2,1};
		// System.out.println("Result : "+TestArray.solution(a) );
		int[] b = { -1, 1, 3, 3, 3, 2, 1, 0 };
		//System.out.println("Result Task1 : " + Task1.solution(b));
		int[] c = { 0, 0 };
		System.out.println("Result Task2 : " + Task2.solution(c));
	}

	public int solution(int[] A) {
		// n length of the array
		int n = A.length;
		int result = 0;
		// Calculate the number of consecutive identical ones, for both sides
		for (int i = 0; i < n - 1; i++) { // why n - 1
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
		}
		return result + r; 
	}

}
