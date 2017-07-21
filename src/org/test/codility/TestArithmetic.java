package org.test.codility;

import java.util.HashMap;
import java.util.Map;

public class TestArithmetic {

	public static void main(String[] args) {
		// int A[] = {1, 2, 3, 4};
		int A[] = { 2, 4, 6, 8, 10 };
		//int A[] = {-1,1,3,3,3,2,1,0};
		System.out.println("Result Aricmetic " + numberOfArithmeticSlices(A));
	}

	@SuppressWarnings("unchecked")
	public static int numberOfArithmeticSlices(int[] A) {
		int res = 0;
		Map<Integer, Integer>[] map = new Map[A.length];

		for (int i = 0; i < A.length; i++) {
			map[i] = new HashMap<>(i);

			for (int j = 0; j < i; j++) {
				long diff = (long) A[i] - A[j];
				if (diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE)
					continue;

				int d = (int) diff;
				int c1 = map[i].getOrDefault(d, 0);
				int c2 = map[j].getOrDefault(d, 0);
				res += c2;
				map[i].put(d, c1 + c2 + 1);
			}
		}

		return res;
	}
}
