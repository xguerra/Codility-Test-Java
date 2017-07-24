package org.test.codility;

import java.util.ArrayList;
import java.util.List;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		int[] array = {9, 3, 9, 3, 9, 7, 9};
		System.out.println("Rotate "+ solution(array));
	}
	
	public static int solution(int[] A) {
		if (A == null || A.length == 1){
			return 0;
		}
		int length = A.length;
		
        int result = 0;
        List<Integer> filterList = new ArrayList<>();
        for (int i = 0; i < length; i++){
        	if (filterList.contains(i)){
        		continue;
        	}
        	if (A[i] >= 1 && A[i] <= 1000000){
        		boolean pair = false;
            	for (int j = i+1; j < length; j++){
            		if (A[i] == A[j]){
            			pair = true;
            			filterList.add(i);
            			filterList.add(j);
            			break;
            		}
            	}
            	if (!pair){
            		result = A[i];
            	}
        	} else{
        		return 0;
        	}
        }
        return result;
    }
}
