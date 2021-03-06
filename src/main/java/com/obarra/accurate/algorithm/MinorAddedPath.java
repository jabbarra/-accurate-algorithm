/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.obarra.accurate.algorithm;

public class MinorAddedPath {

    public long[] getMinorAddedPath(final int[][] matrix) {
        int[] directionY = {-1, 0, 1};
        long[] minorPathAndValue = {-1, -1, -1, 0};
        long minorAdded = 0;

        for (int row = 0; row < 3; row++) {
            int initialPosition = 0;
            for (int f = 0; f < 3; f++) {
                int firstMovement = row + directionY[f];
                if (firstMovement < 0 || firstMovement > 2)
                    continue;
                for (int s = 0; s < 3; s++) {
                    int secondMovement = row + directionY[f] + directionY[s];
                    if (secondMovement < 0 || secondMovement > 2)
                        continue;
                    long result = matrix[row][initialPosition] +
                            matrix[firstMovement][initialPosition + 1] +
                            matrix[secondMovement][initialPosition + 2];
                    if (minorAdded == 0 || minorAdded > result) {
                        minorPathAndValue[3] = minorAdded = result;
                        minorPathAndValue[0] = matrix[row][initialPosition];
                        minorPathAndValue[1] = matrix[firstMovement][initialPosition + 1];
                        minorPathAndValue[2] = matrix[secondMovement][initialPosition + 2];
                    }
                }
            }
        }

        return minorPathAndValue;
    }
}
