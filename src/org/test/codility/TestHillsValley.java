package org.test.codility;

public class TestHillsValley {

	public static void main(String[] args) {
		int A[] = {-3,-3};
		//int A[] = { 2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5 };
		System.out.println("Result Valley and Hills " + solution(A));
	}

	public static int solution(int[] A) {
		int n = A.length;
		int result = 0;
		if (n < 1 && n > 1000) {
			return 0;
		}
		int minValue = -1000000000;
		int maxValue = 1000000000;
		for (int i = 1; i < n; i++) {
			if (A[i] >= minValue && A[i] <= maxValue) {
				if (A[i - 1] == A[i]) {
					result += 1;
				}
			} else {
				return 0;
			}

		}
		result = result == 1 ? 1 : Math.round(result / 2);

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				if (A[i] > A[i+1]) {
					result += 1;
				}
			} else {
				if (i == n -1 && A[i] > A[i-1] ) {
					result += 1;
				} else {
					if (A[i] > A[i-1] && A[i] > A[i+1]) {
						result += 1;
					}
				}
			}

		}
		return result;
	}
}
