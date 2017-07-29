package org.test.codility;

import java.util.ArrayList;
import java.util.List;

public class TestElevator {

	public static void main(String[] args) {
        int A[] = {40, 40, 100, 80, 20};
        int B[] = {3, 3, 2, 2, 3};
        int people = 5;
        int weight = 200;
        System.out.println("One "+ solution(A, B, people, weight));

        int X[] = {60, 80, 40};
        int Y[] = {2, 3, 5};
        people = 2;
        weight = 200;
        System.out.println("Two "+ solution(X, Y, people, weight));
	}

	public static int solution(int[] A, int[] B, int X, int Y) {
        List<Integer> stops = new ArrayList<>();

        int weightAmount = 0;
        int quantityPeople = 0;
        int quantityStop = 0;
        for (int i = 0; i < A.length; i++) {
            quantityPeople++;
            weightAmount += A[i];
            if (quantityPeople > X || weightAmount > Y) {
                quantityStop += stops.size();
                stops.clear();
                quantityPeople = weightAmount = 0;
                i--;
                quantityStop++;
            } else {
                stops.add(B[i]);
            }
        }
        return quantityStop + 1 + stops.size();
    }
}
