package org.test.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 0; 
		int k = 1;
		if (in.hasNext()){
			n = in.nextInt();
		}
		if (in.hasNext()){
			k = in.nextInt();
		} 
        int a[] = new int[n];
        StringBuffer result = new StringBuffer();
        for(int a_i=0; a_i < n; a_i++){
        	int index = calculateValueIndex(a_i, n, n-k);
            a[index] = in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
			result.append(a[i]);
			result.append(" ");
		}
        System.out.println(result.toString());
        in.close();
	}

	public static int calculateValueIndex(int index, int lengthArray, int rotateValue){
		int newIndex = index + rotateValue;
		if (newIndex >= lengthArray){
			return newIndex - lengthArray;
		}
		return newIndex;
	}

}
