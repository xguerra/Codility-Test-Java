package org.test.codility;

import java.util.HashMap;
import java.util.Map;

public class TestArithmeticTwo {

	public static void main(String[] args) {
		//int A[] = {1, 2, 3, 4};
		int A[] = { 2, 4, 6, 8, 10 };
		//int A[] = {-1,1,3,3,3,2,1,0};
		System.out.println("Result Aricmetic " + solution(A));
	}

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
                result += 1;
            }
        }
        if (result == 1){
        	result = calculateSlices(A);
        }
        return result;
    }
	
	public static int calculateSlices(int[] A){
		int result = 1;
		for (int i = 0; i < A.length; i++){
			int q = 1;
			for (int j = 0; j < i ; j++){
				q+=1;
				if (q == 3){
					result+=1;
					break;
				}
			}
		}
		return result;
	}
}
