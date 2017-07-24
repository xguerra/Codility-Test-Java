package org.test.codility;

public class CyclicRotation {

	public static void main(String[] args) {
		System.out.println("Valor "+calculateValueIndex(2, 5, 3));
		int[] array = {3, 8, 9, 7, 6};
		System.out.println("Rotate "+ solution(array, 3));
	}
	
	public static int[] solution(int[] A, int K) {
		int length = A.length;
		if (K > length || length == 1 || !(K >= 0 && K <= 100)){
			return A;
		}
		
        int[] result = new int[length];
        for (int i = 0; i < length; i++){
        	int index = calculateValueIndex(i, length, K);
        	result[index] = A[i];
        }
        return result;
    }

	public static int calculateValueIndex(int index, int lengthArray, int rotateValue){
		int newIndex = index + rotateValue;
		if (newIndex >= lengthArray){
			return newIndex - lengthArray;
		}
		return newIndex;
	}
}
