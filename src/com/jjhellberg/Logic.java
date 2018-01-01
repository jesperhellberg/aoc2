package com.jjhellberg;

import java.util.Arrays;
import java.util.Collections;

public class Logic {

    private Integer[][] setUpMatrix(String input) {
        String [] lines = input.split("\n");
        Integer[][] matrix = new Integer[lines.length][];

        for(int i = 0; i < lines.length; i++) {
            String[] stringNumbers = lines[i].split("\t");
            matrix[i] = new Integer[stringNumbers.length];
            for(int j = 0; j < stringNumbers.length; j++) {
                matrix[i][j] = Integer.parseInt(stringNumbers[j]);
            }
        }
        return matrix;
    }


    public int getChecksum(String input) {
        Integer[][] matrix = setUpMatrix(input);
        int checksum = 0;

        for (Integer[] array : matrix) {
            int min = Collections.min(Arrays.asList(array));
            int max = Collections.max(Arrays.asList(array));
            checksum += max - min;
        }


        return checksum;
    }

}
