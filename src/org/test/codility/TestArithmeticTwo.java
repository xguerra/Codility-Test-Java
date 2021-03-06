package org.test.codility;


import java.util.Arrays;

public class TestArithmeticTwo {

	public static void main(String[] args) {
		//int A[] = {1, 2, 3, 4};
		//int A[] = { 2, 4, 6, 8, 10 };
		int A[] = {-1,1,3,3,3,2,1,0};
		System.out.println("Result Aricmetic " + solution(A));
	}

	public static int solution(int[] A) {
		int result = 0;
		if (A == null || A.length < 3 || A.length > 100) {
			return result;
		}
		int i = 1;
        int len = A.length;
        int minValue = -1000000000;
        int maxValue = 1000000000;
        while (i < len) {
        	if (A[i] >= minValue && A[i] <= maxValue) {
        		int consecutive = 1;
                int diff = A[i - 1] - A[i];
                int beginIndex = i-1;
                while (i < len && A[i - 1] - A[i] == diff) {
                    i++;
                    consecutive++;
                }
                if (consecutive == 3) {
                    result += 1;
                } else if (consecutive > 3) {
                	int[] B = Arrays.copyOfRange(A, beginIndex, i);
                	result += calculateSlices(B);
                }
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
