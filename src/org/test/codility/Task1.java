package org.test.codility;

public class Task1 {

	public static int solution(int[] A) {
		int result = 0;
		if (A == null || A.length < 3) {
			return result;
		}
		int i = 1;
        int len = A.length;
        while (i < len) {
            int consecutive = 1;
            int diff = A[i - 1] - A[i];
            while (i < len && A[i - 1] - A[i] == diff) {
                i++;
                consecutive++;
            }
            if (consecutive >= 3) {
                result += calculateConsecutive(consecutive);
            }
        }
        return result;
    }
     
    public static int calculateConsecutive(int l) {
        return (l - 1) * (l - 2) / 2;
    }

}
