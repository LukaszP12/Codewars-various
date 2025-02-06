package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;

public class FindUniq_6kyu {
    public static double findUniq(double arr[]) {
        HashSet<Double> numbersAtleast1 = new LinkedHashSet<>();
        HashSet<Double> duplicates = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (numbersAtleast1.contains(arr[i])) {
                numbersAtleast1.remove(arr[i]);
                duplicates.add(arr[i]);
            } else {
                numbersAtleast1.add(arr[i]);
            }
        }

        return numbersAtleast1.stream().findFirst().get();
    }

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
        System.out.println(findUniq(new double[]{0, 0, 0.55, 0, 0}));
        System.out.println(findUniq(new double[]{1.0, 1.0, 3.0, 8.0, 8.0,4.0}));
    }
}
