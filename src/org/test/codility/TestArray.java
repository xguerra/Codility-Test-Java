package org.test.codility;

public class TestArray {
	
	public static int solution(int [] a) {
		int len = a.length;
		int[] tableBefore = new int[len];
		int[] tableAfter = new int[len];

		tableBefore[0] = 0;
		for (int i = 1; i < len; i++) {
		    tableBefore[i] = tableBefore[i - 1] + a[i - 1];
		}

		tableAfter[len - 1] = 0;
		for (int i = len - 2; i >= 0; i--) {
		    tableAfter[i] = tableAfter[i + 1] + a[i + 1];
		}

		for (int j = 0; j < len; j++) {
		    if (tableAfter[j] == tableBefore[j]) {
		        return j;
		    }
		}
		return -1;
	}

}
