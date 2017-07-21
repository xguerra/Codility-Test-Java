package org.test.codility;

import java.util.HashMap;
import java.util.Map;

public class TestBinaryGap {

	public static void main(String[] args) {
		//int A[] = {1, 2, 3, 4};
		int A[] = { 2, 4, 6, 8, 10 };
		//int A[] = {-1,1,3,3,3,2,1,0};
		//System.out.println("Result Aricmetic " + solution(A));
		System.out.println("Binario "+solution(1041));
		
	}

	public static int solution(int n) {
		if (n <= 0)
	        return 0;

	    int shift;
	    int maxGap = 0;
	    int tNum = n;

	    shift = Integer.numberOfTrailingZeros(tNum);
	    tNum = (tNum >>> shift);

	    while (tNum > 0) {
	        while ((tNum & 1) == 1) {
	            tNum = (tNum >>> 1);
	        }

	        if (tNum > 0) {
	            shift = Integer.numberOfTrailingZeros(tNum);
	            tNum = (tNum >>> shift);

	            if ((tNum & 1) == 1) {
	                maxGap = Math.max(maxGap, shift);
	            }
	        }
	    }
	    return maxGap;
    }
}
