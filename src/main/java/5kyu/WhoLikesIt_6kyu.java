package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WhoLikesIt_6kyu {
    public static String whoLikesIt(String... names) {
        if (names == null || names.length == 0) {
            return "no one likes it";
        }
        List<String> likers = new LinkedList<>();
        likers = Arrays.asList(names);

        if (likers.size() == 1) {
            return likers.get(0) + " likes this";
        } else if (likers.size() == 2) {
            return likers.get(0) + " and " + likers.get(1) + " like this";
        } else if (likers.size() == 3) {
            return likers.get(0) + ", " + likers.get(1) + " and " + likers.get(2) + " like this";
        } else if (likers.size() > 3) {
            return likers.get(0) + ", " + likers.get(1) + " and " + (likers.size()-2) + " others like this";
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt(""));
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
