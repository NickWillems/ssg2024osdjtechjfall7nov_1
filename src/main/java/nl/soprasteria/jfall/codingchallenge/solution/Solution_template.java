package nl.soprasteria.jfall.codingchallenge.solution;

import java.util.*;

class Solution_template {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        final int[] parsedInput = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(findLISLength(parsedInput));

        in.close();
    }

    private static int findLISLength(final int[] input) {
        return 0;
    }
}
